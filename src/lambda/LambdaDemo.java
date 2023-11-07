package lambda;
import java.io.File;
import java.io.FileFilter;
//lamb
public class LambdaDemo {
    public static void main(String[] args) {
        File dir = new File("./");
//        FileFilter filter = new filter(){
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.getName().contains("o");
//            }
//        };
        //忽略接口名 lamba表达式
        //将重写的方法体删除 保留方法的内部代码
        //添加->符号
        FileFilter filter1 = (File pathname) -> {
            return pathname.getName().contains("o");
        };
        // 参数类型可以忽略（但是顺序不能改变）
        FileFilter filter2 = (pathname) -> {
            return pathname.getName().contains("o");
        };
        //如果方法只有一个参数值 那么()也可以省略
        FileFilter filter3 = pathname -> {
            return pathname.getName().contains("o");
        };
        //如果方法体只有一句代码时 那么可以{}省略 如果含有return 也必须省略
        FileFilter filter4 = pathname -> pathname.getName().contains("o");
        File file = new File(".");
        File[] os= file.listFiles(pathname->pathname.getName().contains("o"));


    }

}
