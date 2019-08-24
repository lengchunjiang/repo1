package cn.idclass.day04.demo07;

public class Ticket {
    public static void main(String[] args) {
        RunableImpl run = new RunableImpl();
        Thread T0 = new Thread(run);
        Thread T1 = new Thread(run);
        Thread T2 = new Thread(run);
        T0.start();
        T1.start();
        T2.start();
    }
}
