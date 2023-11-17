package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        //创建文件的输入流
        FileInputStream fis = new FileInputStream("./fos.txt");
        //创建文件输出流
        FileOutputStream fos = new FileOutputStream("./abc.txt");
        int data;
        long start=System.currentTimeMillis();
        while ((data =fis.read()) !=-1){
            fos.write(data);
        }
        long end=System.currentTimeMillis();
        System.out.println("复制完毕！一共耗费时间"+(end-start)+"秒");
    }
}
