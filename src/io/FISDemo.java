package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./fos.txt");
        //使用read方法
        //int data = fis.read();
        //System.out.println((char)data);
        //重复的读取操作
        int data;
        while ((data = fis.read()) !=-1){

            System.out.println((char)data);
        }
        fis.close();
    }
}
