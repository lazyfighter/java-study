package com.lazyfighter.study.base.threadlocal;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadLocalBase {

    private static final AtomicInteger nextId = new AtomicInteger(0);

    private static final ThreadLocal<Integer> threadId = ThreadLocal.withInitial(() -> nextId.getAndIncrement());

    public static int get() {
        return threadId.get();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                int threadId = get();
                System.out.println(threadId);
            }).start();
        }
    }

}
