package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TestNote2 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请开始输入内容：");
        FileOutputStream fos = new FileOutputStream("./a.txt",true);// 开启追加模式

        while (true) {
            String line = scanner.nextLine();
            if ("exit".equals(line)) {
                break;
            }
            fos.write(line.getBytes(StandardCharsets.UTF_8));
        }
        fos.close();
    }
}
