
class OuterClass {


   class InnerClass1 {
    void message() {
      System.out.println("Message from inner class.");
    }
  }


  // define static inner class.
  static class InnerClass {
    // non static method.
    void nonStaticMethod() {
      System.out.println("Non static method of InnerClass.");
    }
    
    // static method.
    static void staticMethod() {
      System.out.println("Static method of InnerClass.");
    }
  }
}

class Op_14_innerclass{
  @SuppressWarnings("static-access")
  public static void main(String[] args) {
    // now access inner class from Outer class.
    OuterClass.InnerClass innerObj = new OuterClass.InnerClass();
    innerObj.nonStaticMethod(); // access non static method.
    innerObj.staticMethod(); // access static method.
    /*   */
    OuterClass outerObj = new OuterClass();
    // now create inner class Object.
    OuterClass.InnerClass1 innerObj1 = outerObj.new InnerClass1();
    innerObj1.message();
  }
}