package cn.idclass.day04.demo02;

public class array {
    public static void main(String[] args) {
        Prrson[] array = new Prrson[3];

        Prrson one = new Prrson( "a",12);
        Prrson three = new Prrson( "a",12);
        Prrson two = new Prrson( "a",12);
        array[0] = one;
        array [1] = two;
        array[2] = three;

        System.out.println(array[1].getName());
    }
}
