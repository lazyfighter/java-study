package com.lazyfighter.study.design.pattern.chain.impl;

import com.lazyfighter.study.design.pattern.chain.AbstractLinkedProcessorChain;

public class ThirdProcessorChain extends AbstractLinkedProcessorChain {
    @Override
    public void entry() {
        System.out.println("third chain entry");
        fireEntry();
    }

    @Override
    public void exit() {
        System.out.println("third chain exit");
        fireExit();
    }
}
