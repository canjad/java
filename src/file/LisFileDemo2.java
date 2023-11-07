package file;

import java.io.File;
import java.io.FileFilter;
//重载listFile文件方法

public class LisFileDemo2 {
    public static void main(String[] args) {
        File dir = new File("./");
        filter filter = new filter(){
            @Override
            public boolean accept(File pathname) {
                String name= pathname.getName();
                System.out.println("正在过滤"+name);
                boolean o=name.contains("o");
                return o;
            }
        };
        File[] subs = dir.listFiles(filter);
        System.out.println("共有子项"+subs.length+"个");
        for (int i = 0; i < subs.length; i++) {
            System.out.println(subs[i].getName());
        }
    }
}
class filter implements FileFilter{


    @Override
    public boolean accept(File pathname) {
        return false;
    }
}

