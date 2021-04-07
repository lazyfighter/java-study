package com.lazyfighter.study.loader;

import java.io.InputStream;
import java.util.Objects;

public class MyClassLoader extends ClassLoader {

    private ClassLoader extClassLoader;


    private ClassLoader appClassCloader;


    public MyClassLoader(ClassLoader extClassLoader, ClassLoader appClassCloader) {
        this.extClassLoader = extClassLoader;
        this.appClassCloader = appClassCloader;
    }

    @Override
    public Class<?> loadClass(String name) {
        try {
            try {
                Class<?> aClass = extClassLoader.loadClass(name);
                if (Objects.nonNull(aClass)) {
                    return aClass;
                }
            } catch (Exception e) {
            }
            String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
            InputStream resourceAsStream = this.getClass().getResourceAsStream(fileName);
            int available = resourceAsStream.available();
            byte[] s = new byte[available];
            resourceAsStream.read(s);
            return defineClass(name, s, 0, s.length);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

