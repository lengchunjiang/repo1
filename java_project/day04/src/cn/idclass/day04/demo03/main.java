package cn.idclass.day04.demo03;
import java.util.ArrayList;


public class main {
    public static void main(String[] args) {
        Manger manager = new Manger("群主",110);

        Member one = new Member("A",0);
        Member three = new Member("B",0);
        Member two = new Member("C",0);
        one.show();
        ArrayList<Integer> redlist = manager.send(20,3);
        one.receive(redlist);
        two.receive(redlist);
        three.receive(redlist);

        manager.show();
        one.show();
        two.show();
        three.show();
    }


}
