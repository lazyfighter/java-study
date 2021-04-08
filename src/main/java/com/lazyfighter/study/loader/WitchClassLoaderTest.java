package com.lazyfighter.study.loader;




public class WitchClassLoaderTest {


    public static void main(String[] args) {
        ClassLoader app = ClassLoader.getSystemClassLoader();
        ClassLoader ext = ClassLoader.getSystemClassLoader().getParent();
        MyClassLoader one = new MyClassLoader(ext, app);
        MyClassLoader two = new MyClassLoader(ext, app);
        Class<?> aClass = one.loadClass(WitchClassLoaderTest.class.getName());

        System.out.println(WitchClassLoaderTest.class.getClassLoader());
        Class<?> aClass1 = two.loadClass(WitchClassLoaderTest.class.getName());
        System.out.println("---------------------------");
        System.out.println(WitchClassLoaderTest.class.getClassLoader());
        System.out.println("---------------------------");
        System.out.println(aClass.getClassLoader());
        System.out.println(aClass1.getClassLoader());

    }
}
