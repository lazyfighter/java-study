package com.lazyfighter.study.loader;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyClassLoaderTest {

    @Test
    public void testClassLoader() throws Exception {

        ClassLoader appClassLoader = this.getClass().getClassLoader();
        ClassLoader myClassLoader = new MyClassLoader(appClassLoader.getParent(), appClassLoader);

        Class<?> aClass = myClassLoader.loadClass(MyClassLoaderTest.class.getName());
        Object o = aClass.newInstance();
        Assertions.assertFalse(o instanceof MyClassLoaderTest);

    }

}
