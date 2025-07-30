 public class Op_11_AccessModifiers {
  // define private method.
  /* Java private Access Modifier */
  private void privateMethod() {
    System.out.println("This is private method");
  }
   /* Java default Access Modifiers */
  public static void main(String[] args) {
    //now try to access privateMethos.
    Op_11_AccessModifiers a = new Op_11_AccessModifiers();
    a.privateMethod();
  }
}