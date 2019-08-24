package cn.idclass.day04.demo03;

public class User {
    private String name;
    private int money;

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public User(int money) {
        this.money = money;
    }

    public User(String name) {
        this.name = name;
    }
    public User() {
    }
    public void show(){
        System.out.println("我叫 " +name+" 我有"+money);

    }
}
