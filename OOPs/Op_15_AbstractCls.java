// abstract class.
abstract class Vehicle {  
  // constructor.
  Vehicle(){
   	System.out.println("Abstract class constructor");
  }
   
   // abstract method.
  abstract void run();
  
  // non-abstract method.
  void nonAbstractMethod() {
    System.out.println("Abstract class : nonAbstractMethod()");
  }
  
  // static method.
  static void staticMethod() {
    System.out.println("Abstract class : staticMethod()");
  }
  
  // final method.
  final void finalMethod() {
    System.out.println("Abstract class : finalMethod()");
  }
}  

// main class.
class Bike extends Vehicle {
  void run() {
    System.out.println("Bike is running");
  } 
  
  public static void main(String args[]){  
    Bike b = new Bike();
    b.run();
    b.nonAbstractMethod();
    b.finalMethod();
    Vehicle.staticMethod(); // class static method.
  }
}