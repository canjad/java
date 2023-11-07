package file;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        //访问当前目前目录下demo.txt
        /**
         * 绝对路径 相对路径
         */
        //光标放到最后 ctrl alt +v
        File file = new File("./demo");
        //File file = new File("./demo");
        long length = file.length();
        System.out.println("文件的长度" + length);

        boolean file1 = file.isFile();
        System.out.println("是否是文件"+file1);

        boolean directory = file.isDirectory();
        System.out.println("是否是文件夹"+directory);

        String name = file.getName();
        System.out.println("文件名"+name);

        boolean exists = file.exists();
        System.out.println("文件是否存在" + exists);

        String parent = file.getParent();
        System.out.println("文件的父路径"+parent);

        File absoluteFile = file.getAbsoluteFile();
        System.out.println("文件的完整路径:"+absoluteFile);



    }
}
