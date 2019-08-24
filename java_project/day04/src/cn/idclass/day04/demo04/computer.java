package cn.idclass.day04.demo04;

public class computer {
    public void powerOn(){
        System.out.println("kai ji");
    }
    public void powerOff(){
        System.out.println("guanji");
    }

    public void useDevice(USB usb){
        usb.open();

        usb.close();
    }
}
