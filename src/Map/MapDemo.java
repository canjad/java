package Map;

import java.util.HashMap;

/**
 *
 *  java.util.HashMap 散列表
 *
 * */
public class MapDemo {

    public static void main(String[] args) {
        //创建一个map实例 使用hashMap 也需要指定key:value
        HashMap<String,Integer> map = new HashMap<>();
        //向map中存储keyword:value value's
        map.put("语文",100);
        map.put("英语",90);
        Integer v=map.put("化学",50);
        System.out.println(v);
        System.out.println(map);

        //如果在次存储重复的key值 那么会将原来的value值进行覆盖
        v=map.put("化学",60);
        System.out.println(v);
        System.out.println(map);

        //根据指定的key值 获取对应的value值

        v=map.get("英语");
        System.out.println(v);
        //获取当前键值对的个数
        int size=map.size();
        System.out.println(size);

        //删除给定的key的键值对
        v=map.remove("英语");
        System.out.println(v);
        System.out.println(map);

        //判定是否有给定的key或者value
        boolean ck = map.containsKey("语文");
        System.out.println(ck);
    }
}
