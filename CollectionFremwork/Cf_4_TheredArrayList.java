import java.util.ArrayList;

public class Cf_4_TheredArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        Thread t1=new Thread(()->{
            for(int i=0;i<=1000;i++)
            {
                list.add(i);
            }
        });
        Thread t2=new Thread(() ->{
            for(int i=0;i<=1000;i++)
            {
                list.add(i);
            }
        });
        t1.start();
        t2.start();;
        try{
            t1.join();
            t2.join();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(list.size());
    }
}
