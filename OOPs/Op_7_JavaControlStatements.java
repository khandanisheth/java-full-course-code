public class Op_7_JavaControlStatements {
  @SuppressWarnings("unused")
  public static void main(String[] args) {
    /* Java if or else Example */
    int age = 25;
    if (age >= 18) {
      System.out.println("Yes ! You are eligible to vote.");
    } else {
      System.out.println("No ! You are eligible to vote.");
    }

    /* Java if else if */

    int marks = 86;
    if (marks >= 90) {
      System.out.println("Grade : A+");
    } else if (marks >= 80) {
      System.out.println("Grade : A");
    } else if (marks >= 70) {
      System.out.println("Grade : B");
    } else {
      System.out.println("Grade : C");
    }

    /* Java if else Short Hand */

    String res = null;
    res = (10 >= 2) ? "yes" : "No";
    System.out.println(res);

    /* Java nested while loop example */

    int x1 = 1, y;
    while (x1 <= 10) {
      y = 1;
      System.out.print(y + " ");
      while (y < x1) {
        y++;
        System.out.print(y + " ");
      }
      ++x1;
      // line break.
      System.out.print("\n");
    }

    /* Java break label Example */

    // define label for outer loop.
    outer_loop: for (int i = 1; i <= 3; i++) {

      // give label for inner loop also.
      inner_loop: for (int j = 1; j <= 3; j++) {
        if (j == 2) {
          // now here pass that label for which you want to break.
          break outer_loop;
        }
        System.out.println(i + " " + j);
      }
    }
  }
}
