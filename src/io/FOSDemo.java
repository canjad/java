package io;

import java.io.*;

public class FOSDemo {
    public static void main(String[] args) throws IOException {
        //创建file
//        File file = new File("./fos.txt");
//        FileOutputStream fileOutputStream = new FileOutputStream(file);
        FileOutputStream fos = new FileOutputStream("./fos.txt");
        //开始向fos.txt 中写数据
        fos.write(100);
        //可以直接写出一组字节数据
        fos.write(13);
        fos.write("ABCDE".getBytes());
        fos.write("hello world\r\n~~~".getBytes(),2,5);
        //关闭文件流
        fos.close();
    }
}
