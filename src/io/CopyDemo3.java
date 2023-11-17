package io;

import java.io.*;

public class CopyDemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./fos.txt");
        FileOutputStream fos = new FileOutputStream("./d.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //利用块进行读写 int read(byte[] data) 一次性给定的数组的总长度的字节流
        //返回值为实际读取的到返回字节量

        long strart=System.currentTimeMillis();
        int d;
        while((d=bis.read())!=-1){
            bos.write(d);
        }
        long end=System.currentTimeMillis();
        System.out.println("复制完毕 一共花费："+(end-strart)+"秒");
       bos.close();
       bis.close();
    }


}

