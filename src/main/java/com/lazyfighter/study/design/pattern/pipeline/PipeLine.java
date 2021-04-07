package com.lazyfighter.study.design.pattern.pipeline;

import com.lazyfighter.study.design.pattern.pipeline.stage.StageNode;
import com.lazyfighter.study.design.pattern.pipeline.stage.impl.FirstNode;
import com.lazyfighter.study.design.pattern.pipeline.stage.impl.SecondNode;
import com.lazyfighter.study.design.pattern.pipeline.stage.impl.ThirdNode;

import java.util.Objects;

public class PipeLine {

    private PipeLineContext pipeLineContext;


    private StageNode header;

    public PipeLine(PipeLineContext pipeLineContext) {
        this.pipeLineContext = pipeLineContext;
    }

    public static void main(String[] args) {
        PipeLineContext pipeLineContext = new PipeLineContext();
        PipeLine pipeLine = new PipeLine(pipeLineContext);
        FirstNode firstNode = new FirstNode();
        SecondNode secondNode = new SecondNode();
        ThirdNode thirdNode = new ThirdNode();
        StageNode firstStage = new StageNode(firstNode, firstNode.getClass().getName());
        StageNode secondStage = new StageNode(secondNode, secondNode.getClass().getName());
        StageNode thirdStage = new StageNode(thirdNode, thirdNode.getClass().getName());
        pipeLine.header = firstStage;
        firstStage.addNextNode(secondStage);
        secondStage.addNextNode(thirdStage);

        pipeLine.execute();
    }


    private void execute() {
        if (Objects.nonNull(header)) {
            header.stepIn(pipeLineContext);
        }
    }

}
