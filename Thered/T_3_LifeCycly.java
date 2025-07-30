package Thered;

public class T_3_LifeCycly extends Thread{
    @Override
    public void run()
    {
        System.out.println("Thread State run() Function Me    ->Running");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws InterruptedException{
        T_3_LifeCycly t=new T_3_LifeCycly();
        System.out.println("Main Thread Name->"+Thread.currentThread());
        System.out.println("My Thread Name->"+t.getName());
        System.out.println("\n");
        System.out.println("Thread State This Time            -> "+t.getState());
        t.start();
        System.out.println("Thread State Then Start Fun Call  -> "+t.getState());
        Thread.sleep(100);
        System.out.println("Thread State This Time            -> "+t.getState());
        t.join();
        System.out.println("Thread State This Join Fun Then   ->"+t.getState());

    }
}
