package com.lazyfighter.study.design.pattern.pipeline.stage;

import com.lazyfighter.study.design.pattern.pipeline.PipeLineContext;

import java.util.Objects;

public class StageNode implements Stage {


    private StageNode pre;


    private StageNode next;


    private Stage target;


    private String name;

    public StageNode(Stage target, String name) {
        this.target = target;
        this.name = name;
    }

    @Override
    public void stepIn(PipeLineContext pipeLineContext) {
        target.stepIn(pipeLineContext);

        if (Objects.nonNull(next)) {
            next.stepIn(pipeLineContext);
        } else {
            stepOut(pipeLineContext);
        }
    }

    @Override
    public void stepOut(PipeLineContext pipeLineContext) {
        target.stepOut(pipeLineContext);

        if (Objects.nonNull(pre)) {
            pre.stepOut(pipeLineContext);
        }
    }

    public void addNextNode(StageNode next) {
        this.next = next;
        if (Objects.nonNull(next)) {
            next.pre = this;
        }
    }

}
