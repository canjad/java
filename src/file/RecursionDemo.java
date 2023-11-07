package file;

import java.io.File;

public class RecursionDemo {
    public static void main(String[] args) {
        File dir = new File("./a");
        recursionFolder(dir);

    }

    private static void recursionFolder(File dir) {
        if(dir.isFile()){
            System.out.println("文件不支持递归");
            return;
        }else{
            File[] fs = dir.listFiles();
            for (int i = 0; i < fs.length; i++) {
                if (fs[i].isFile()){
                    System.out.println("文件"+fs[i]);
                }else {
                    System.out.println("目录"+fs[i]);
                    recursionFolder(fs[i]);
                }
            }

        }
    }
}
