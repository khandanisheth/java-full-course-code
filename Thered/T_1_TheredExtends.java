package Thered;

class Gym  extends Thread
{
  public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("GYM Start");
            try {
                System.out.println("Break");
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }
}



class eat  extends Thread
{
  public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Eat Start");
            try {
                System.out.println("Sleep");
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           
        }
    }
}
public class T_1_TheredExtends {
    public static void main(String[] args) throws InterruptedException {
        Gym g=new Gym();
        eat e=new eat();
        g.start();
        e.start();

        g.join();
        e.join();
    }
}
