package cn.idclass.day04.demo04;

import java.sql.SQLOutput;

public class mouth implements USB{
    @Override
    public void open() {
        System.out.println("da kai shu biao");
    }

    @Override
    public void close() {
        System.out.println("guanbi shubiao ");
    }
}
