package cn.idclass.day04.demo03;
import java.util.ArrayList;
import java.util.Random;
import java.security.PublicKey;

public class Member extends User {
    public Member(String name, int money) {
        super(name, money);
    }

    public Member() {

    }
    public void receive(ArrayList<Integer> list){
        int index = new Random().nextInt(list.size());
        int delta = list.remove(index);

        int money = super.getMoney();
        super.setMoney(money + delta);

    }

}
