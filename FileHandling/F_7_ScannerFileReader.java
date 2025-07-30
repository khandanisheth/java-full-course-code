import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class F_7_ScannerFileReader{
    public static void main(String[] args) {
        try {
            // File object banaya
            File file = new File("Test.txt");

            // File ke content ko read karne ke liye Scanner object banaya
            Scanner scanner = new Scanner(file);

            // File se line-by-line read karna
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            // Scanner ko close karna zaroori hai
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}
