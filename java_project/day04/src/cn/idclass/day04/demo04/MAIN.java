package cn.idclass.day04.demo04;

public class MAIN {
    public static void main(String[] args) {
        computer computer1 = new computer();
        computer1.powerOn();


        USB usbmouth = new mouth();
        computer1.useDevice(usbmouth);
        keyBound keybound = new keyBound();
        computer1.useDevice(keybound);


        computer1.powerOff();
    }
}
