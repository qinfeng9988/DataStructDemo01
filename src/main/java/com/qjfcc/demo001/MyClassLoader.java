package com.qjfcc.demo001;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * @author 秦江峰
 * @AddTime 2019/10/25 17:25
 */
public class MyClassLoader extends ClassLoader {

    private String myClassPath;

    public MyClassLoader(String loadUrl) {
        this.myClassPath = loadUrl;
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        Class<?> c = findLoadedClass(name);
        if (c != null) {
            return c;
        }
        byte[] byteData = get(name);
        if (byteData == null) {
            throw new ClassNotFoundException();
        }
        return defineClass(name, byteData, 0, byteData.length);

    }

    private byte[] get(String className) {
        String path = className.replace(".", "/");
        try {
            URL url = new URL(path);
            InputStream inputStream = url.openStream();
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes);

            int len = -1;
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            while ((len = inputStream.read(bytes)) != -1) {
                baos.write(bytes, 0, len);
            }
            return baos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
