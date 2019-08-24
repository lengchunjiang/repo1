package cn.idclass.day04.demo02;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Random;

/*
<e>

add返回值有到那时可以不用
get(index)
remove(index)有返回值
int size()获取集合的尺寸长度
泛型只能存储引用之不能存储基本只
要对应的包装类
吧基本类型包装一下

byte    Byte
short   Short
int     Interger

 */
public class arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
              int num = r.nextInt(33) + 1;
              list.add(num);
              
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
