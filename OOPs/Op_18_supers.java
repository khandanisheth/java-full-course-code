class Parent{
       protected int num = 1;
       
       Parent(){
           System.out.println("Parent class default constructor.");
       }
       
       Parent(String x){
           System.out.println("Parent class parameterised constructor.");
       }
       
       public void foo(){
           System.out.println("Parent class foo!");
       }
   }
class Child extends Parent{
       private int num = 2;
       
       Child(){
           //super constructor call should always be in the first line
           super();              // Either call default super() to call default parent constructor OR
           //super("Call Parent");    // call parameterised super to call parameterised parent constructor.
           System.out.println("Child class default Constructor");
       }
       
       void printNum(){
           System.out.println(num);
           System.out.println(super.num); //prints the value of num of parent class
       }
       
       @Override
       public void foo(){
           System.out.println("Child class foo!");
           super.foo();    //Calls foo method of Parent class inside the Overriden foo method of Child class.
       }
   }

 class DemoClass {
    public static void main(String args[]) {
     Child demoObject=new Child();
     demoObject.foo();
     /*
      This would print - 
      Parent class parameterised constructor.
      Child class default Constructor
      Child class foo!
      Parent class foo!
     */
    }
}
