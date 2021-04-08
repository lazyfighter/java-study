package com.lazyfighter.study.design.pattern.chain.impl;

import com.lazyfighter.study.design.pattern.chain.AbstractLinkedProcessorChain;

public class SecondProcessorChain extends AbstractLinkedProcessorChain {
    @Override
    public void entry() {
        System.out.println("second chain entry");
        fireEntry();
    }

    @Override
    public void exit() {
        System.out.println("second chain exit");
        fireExit();
    }
}
