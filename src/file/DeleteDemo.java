package file;

import java.io.File;

public class DeleteDemo {
    public static void main(String[] args) {
        File file = new File("demo/test.txt");
        if (file.exists()){
            file.delete();
            System.out.println("文件已经删除");
        }else {
            System.out.println("文件不存在");
        }
    }
}
