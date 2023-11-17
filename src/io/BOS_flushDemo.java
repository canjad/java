package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class BOS_flushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("flash.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("super".getBytes(StandardCharsets.UTF_8));
        bos.flush(); //强制缓冲数组，不用装满，可以对外输出
    }

}
