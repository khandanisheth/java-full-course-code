package Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
public class server {
    public static void main(String[] args) {
        String meassagecli,meassageser;
        try
        {
            ServerSocket ss=new ServerSocket(6666);
            Socket s=ss.accept();
            System.out.println("********************--------------- Chat Start ------------*******************");
            DataInputStream datacli=new DataInputStream(s.getInputStream());
            meassagecli=(String)datacli.readUTF();
            System.out.println("Client Meassage ->"+meassagecli);

            DataOutputStream dataser=new DataOutputStream(s.getOutputStream());
            System.out.println("Enter Meassage Client To Server ->");
            Scanner sc=new Scanner(System.in);
            meassageser=sc.nextLine();
            dataser.writeUTF(meassageser);
            dataser.flush();
            ss.close();
            sc.close();
        }
         catch (Exception e) {
            System.out.println(e);
        }
    }
}
