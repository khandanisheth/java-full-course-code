import java.util.Scanner;

public class IsKaprekar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();//2728
        scanner.close();

        if (isKaprekar(num)) {
            System.out.println(num + " is a Kaprekar number!");
        } else {
            System.out.println(num + " is NOT a Kaprekar number.");
        }
    }

    static boolean isKaprekar(int num) {
        if (num == 1) return true;  // 1 is a Kaprekar number

        int square = num * num;// 7441984
        String squareStr = String.valueOf(square);//"7441984"
        int len = squareStr.length();// 7

        // Check all possible splits
        for (int i = 1; i < len; i++) {// i=2
            int leftPart = Integer.parseInt(squareStr.substring(0, i));   // Left side  744
            int rightPart = Integer.parseInt(squareStr.substring(i));     // Right side 1984

            if (rightPart != 0 && (leftPart + rightPart) == num) {//
                return true;
            }
        }
        return false;
    }
}
