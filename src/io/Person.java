package io;

import java.io.Serializable;
import java.util.Arrays;

public class Person implements Serializable {
    //固定person类的 uid的值
    static final long serialVersionUID = 42L;
    private  String name;
    private  int age;
    private String gender;
    private transient String[] otherinfo; //当进行对象序列化的时候，该属性的值将会被忽略

    private  String salary;
    //生成构造方法 get,set, toString
    public Person(String name, int age, String gender, String[] otherinfo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.otherinfo = otherinfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getOtherinfo() {
        return otherinfo;
    }

    public void setOtherinfo(String[] otherinfo) {
        this.otherinfo = otherinfo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", otherinfo=" + Arrays.toString(otherinfo) +
                '}';
    }
}
