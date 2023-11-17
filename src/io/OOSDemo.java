package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// 将对象存储到文件中的过程也称之为序列化
public class OOSDemo {
    public static void main(String[] args) throws IOException {
        String name="杨建";
        int age =18;
        String gender="男";
        String[] otherinfo={"是一个活波可爱的人"};
        Person p = new Person(name, age, gender, otherinfo);
        System.out.println(p);
        //将对象p写入到person.txt中
        FileOutputStream fos = new FileOutputStream("./person.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(p);
        System.out.println("写入完毕");
        oos.close();
    }
}
