package multithreading;

public class CreatThreadDemo3 extends Thread{
    public static void main(String[] args) {
        //创建无参线程对象
        new Thread(){
            @Override
            public void run() {
                System.out.println("线程执行了...");
            }
        }.start();
        //创建带线程任务的线程对象
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程执行了...");
            }
        }).start();
        //创建带线程任务并且重写run方法的线程对象
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable run 线程执行了...");
            }
        }){
            @Override
            public void run() {
                System.out.println("override run 线程执行了...");
            }
        }.start();
    }

}
