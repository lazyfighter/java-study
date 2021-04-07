package com.lazyfighter.study.design.pattern.pipeline.stage;

import com.lazyfighter.study.design.pattern.pipeline.PipeLineContext;

public interface Stage {

    /**
     *
     */
    void stepIn(PipeLineContext pipeLineContext);


    /**
     *
     */
    void stepOut(PipeLineContext pipeLineContext);


}
