package com.lazyfighter.study.design.pattern.chain;

public interface ProcessorChain {


    /**
     * 节点调用入口
     */
    void entry();

    /**
     * 节点调用结束
     */
    void fireEntry();

    /**
     * 节点调用退出
     */
    void exit();


    /**
     * 节点退出结束
     */
    void fireExit();


}
