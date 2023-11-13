package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./fos.txt");
        FileOutputStream fos = new FileOutputStream("./b.txt");

        //利用块进行读写 int read(byte[] data) 一次性给定的数组的总长度的字节流
        //返回值为实际读取的到返回字节量
        byte[] data=new byte[1024*10];
        int len;//用来记录本次读取的字节数量
        long strart=System.currentTimeMillis();
        while((len= fis.read(data)) !=-1){
            fos.write(data);

        }

        fis.close();
        fos.close();
    }


}

