package file;

import java.io.File;

//删除目录
public class DeleteDemo2 {
    public static void main(String[] args) {
        File dir = new File("dir");
        if (dir.exists()){
            dir.delete();//删除目录 必须是一个空目录 不能递归删除
            System.out.println("目录已经删除");

        }else {
            System.out.println("该目录不存在");
        }
    }
}
