package com.lazyfighter.study.loader;


public class MyClassLoaderTest {

    public static void main(String[] args) throws Exception {
        new MyClassLoaderTest().testClassLoader();
    }


    public void testClassLoader() throws Exception {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        while (systemClassLoader != null) {
            System.out.println(systemClassLoader);
            systemClassLoader = systemClassLoader.getParent();
        }

        ClassLoader appClassLoader = this.getClass().getClassLoader();
        ClassLoader myClassLoader = new MyClassLoader(appClassLoader.getParent(), appClassLoader);

        Class<?> aClass = myClassLoader.loadClass(MyClassLoaderTest.class.getName());
        Object o = aClass.newInstance();
        System.out.println(o instanceof MyClassLoaderTest);
    }

}
