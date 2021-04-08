package com.lazyfighter.study.design.pattern.chain;

public abstract class AbstractLinkedProcessorChain implements ProcessorChain {

    private AbstractLinkedProcessorChain pre;

    private AbstractLinkedProcessorChain next;


    @Override
    public void fireEntry() {
        if (next != null) {
            next.entry();
        } else {
            this.exit();
        }
    }


    @Override
    public void fireExit() {
        if (pre != null) {
            pre.exit();
        }
    }


    public void addNext(AbstractLinkedProcessorChain nextChain) {
        if (next == null) {
            this.next = nextChain;
            next.pre = this;
        } else {
            this.next.pre = nextChain;
            nextChain.next = this.next;
            this.next = nextChain;
        }
    }
}
