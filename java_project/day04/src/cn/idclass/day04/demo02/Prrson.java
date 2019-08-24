package cn.idclass.day04.demo02;

public class Prrson {
    private String name;
    private int age;

    public Prrson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Prrson() {
    }

    public Prrson(int age) {
        this.age = age;
    }

    public Prrson(String name) {
        this.name = name;
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
}
