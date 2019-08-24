package cn.idclass.day04.doudizhu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DouDIZhu {
    public static void main(String[] args) {
        //准备牌
        ArrayList<String> poker = new ArrayList<>();
        //花色序号
        String[] colors  = {"A","B","C","D"};

        String[] numbers ={"2","A","K","Q","j","10","9","8","7","6","5","4","3"};

        poker.add("大王");
        poker.add("小王");
        for (String number : numbers) {
            for (String color : colors) {
                //System.out.println(color+number);
                poker.add(color+number);
            }

        }

        Collections.shuffle(poker);
        System.out.println(poker);
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> DIPAI = new ArrayList<>();


        for (int i = 0; i < poker.size() ; i++) {
            String p = poker.get(i);
            if(i>=51){
                DIPAI.add(p);
            }else if(i%3==0){
                player01.add(p);
            }else if(i%3==1){
                player02.add(p);
            }else if(i%3==2){
                player03.add(p);
            }

        }
        System.out.println(player01);



    }
}
