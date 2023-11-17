package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TestNote {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请开始输入内容：");
        FileOutputStream fos = new FileOutputStream("./a.txt");

        while (true){
            String line= scanner.nextLine();
            if("exit".equals(line)){
                break;
            }
           fos.write(line.getBytes(StandardCharsets.UTF_8));
            fos.close();


        }
    }
}
