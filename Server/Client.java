package Server;

import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client{
    public static void main(String[] args) {
        String mesaagecl,mesaageser;
      try
      {
            Socket so = new Socket("192.168.137.1", 6666);
            DataOutputStream datacel = new DataOutputStream(so.getOutputStream());
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Meassage Client To Server ->");
            mesaagecl=sc.nextLine();
            datacel.writeUTF(mesaagecl);
            datacel.flush();

            DataInputStream dataser=new DataInputStream(so.getInputStream());
            mesaageser=(String)dataser.readUTF();
            System.out.println("Server Meassage ->"+mesaageser);
            so.close();sc.close();
      }
      catch(Exception e)
      {
        System.out.println(e);
      }
    }
}
