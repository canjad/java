package file;

import java.io.File;
import java.io.IOException;

/**
 * 使用file 新建文件
 */

public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException {
        //在当前项目demo目录下新建一个文件
        //在相对路径中./
        //File file = new File("./demo/test.txt");
        File file = new File("demo/test.txt");
        boolean exists = file.exists();
        if(file.exists()){
            System.out.println("文件已存在");
        }else {
            file.createNewFile();
            System.out.println("file is aleary creating");
        }
    }
}
