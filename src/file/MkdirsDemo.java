package file;

import java.io.File;

/**
 * 创建目录
 */
public class MkdirsDemo {
    public static void main(String[] args) {
        //当前目录下创建一个新的目录 dir
        File dir = new File("a/b/dir");
        if (dir.exists()){
            System.out.println("目录已经存在");
        }else {
            dir.mkdirs();//创建目录时，会把不存在的父目录也创建出来
            System.out.println("目录创建成功");
        }

    }
}
