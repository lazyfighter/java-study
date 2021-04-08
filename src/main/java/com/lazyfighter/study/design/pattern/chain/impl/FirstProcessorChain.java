package com.lazyfighter.study.design.pattern.chain.impl;

import com.lazyfighter.study.design.pattern.chain.AbstractLinkedProcessorChain;

public class FirstProcessorChain extends AbstractLinkedProcessorChain {
    @Override
    public void entry() {
        System.out.println("first chain entry");
        fireEntry();
    }

    @Override
    public void exit() {
        System.out.println("first chain exit");
        fireExit();
    }
}
