package cn.idclass.day04.demo06;

import java.util.Date;

public class date {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    private  static void demo02(){
         Date date = new Date(0);
        System.out.println(date);
    }

    private static void demo01(){
        Date date = new Date();
        System.out.println(date);
    }
}
