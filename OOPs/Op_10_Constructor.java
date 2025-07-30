 public class Op_10_Constructor {
  // ddefault constructor with no parameters.
  Op_10_Constructor() {
    System.out.println("Default Constructor");
  }
  
  // parameterized constructor
  Op_10_Constructor(String name) {
    System.out.println("Name : "+ name);
  }
  
  // another parameterized constructor
  Op_10_Constructor(String name, int age) {
    System.out.println("Name : "+ name + ", Age : "+ age);
  }
 
  public static void main(String[] args) {
    // create object without argument.
      new Op_10_Constructor();
    // now pass value.
     new Op_10_Constructor("Rahul");
     new Op_10_Constructor("Anuj", 60);
  }
}