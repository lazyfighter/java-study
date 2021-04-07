package com.lazyfighter.study.design.pattern.pipeline.stage.impl;

import com.lazyfighter.study.design.pattern.pipeline.PipeLineContext;
import com.lazyfighter.study.design.pattern.pipeline.stage.Stage;

public class FirstNode implements Stage {


    @Override
    public void stepIn(PipeLineContext pipeLineContext) {
        System.out.println(this.getClass().getName() + "in.......");
    }

    @Override
    public void stepOut(PipeLineContext pipeLineContext) {
        System.out.println(this.getClass().getName() + "out.......");

    }
}
