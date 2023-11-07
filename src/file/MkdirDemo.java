package file;

import java.io.File;

/**
 * 创建目录
 */
public class MkdirDemo {
    public static void main(String[] args) {
        //当前目录下创建一个新的目录 dir
        File dir = new File("dir");
        if (dir.exists()){
            System.out.println("目录已经存在");
        }else {
            dir.mkdir();
            System.out.println("目录创建成功");
        }

    }
}
