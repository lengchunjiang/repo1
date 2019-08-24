package cn.idclass.day04.demo07;

public class RunableImpl implements Runnable {
    //设置线程任务

    private int tocket = 100;

    @Override
    public void run() {

        while(true){
            if(tocket>0){
                //卖！
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {

                }
                System.out.println(Thread.currentThread().getName()+"-->正在卖"+tocket);
                tocket--;
            }
        }
    }
}
