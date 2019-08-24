package cn.idclass.day04.demo02;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Demo01 {


    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        System.out.println("输入第一个数字");
        int one = a.nextInt();
        int two = a.nextInt();
        int three = a.nextInt();
        int max = 0;
        if(one>two){
            max = one;
        }
        else{
            max = two;
        }
        if(max<three){
            max = three;
        }


        System.out.println("输入的数字是"+max);



    }
}
