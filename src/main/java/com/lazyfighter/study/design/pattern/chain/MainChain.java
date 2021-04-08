package com.lazyfighter.study.design.pattern.chain;

import com.lazyfighter.study.design.pattern.chain.impl.FirstProcessorChain;
import com.lazyfighter.study.design.pattern.chain.impl.SecondProcessorChain;
import com.lazyfighter.study.design.pattern.chain.impl.ThirdProcessorChain;

public class MainChain {


    public static void main(String[] args) {
        FirstProcessorChain firstProcessorChain = new FirstProcessorChain();
        SecondProcessorChain secondProcessorChain = new SecondProcessorChain();
        ThirdProcessorChain thirdProcessorChain = new ThirdProcessorChain();
        firstProcessorChain.addNext(secondProcessorChain);
        secondProcessorChain.addNext(thirdProcessorChain);
        firstProcessorChain.entry();
    }
}
