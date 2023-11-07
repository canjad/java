package file;

import java.io.File;

//获取目录中的子项
public class ListFilesDemo {
    public static void main(String[] args) {
        //定位项目目录
        File dir = new File(".");
        File[] subs = dir.listFiles();
        //.fori 快速生成利用下标遍历该对象的for 循环
        for (int i = 0; i < subs.length; i++) {
            System.out.println(subs[i]);
        }

    }

}
