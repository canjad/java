package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class StringDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./a.txt");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        //将字符数组转成字符串并指定编码
        String s = new String(data, StandardCharsets.UTF_8);
        System.out.println(s);
        fis.close();
    }
}
