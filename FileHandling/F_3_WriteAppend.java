import java.io.FileWriter;
import java.io.IOException;

public class F_3_WriteAppend {
    public static void main(String[] args) {
        try {
            // First FileWriter (append mode)
            FileWriter writer1 = new FileWriter("ss.txt", true);  // true means append mode
            writer1.write("First line of text.\n");
            writer1.close();  // Close the first writer

            // Second FileWriter (append mode)
            FileWriter writer2 = new FileWriter("ss.txt", true);  // Append mode again
            writer2.write("Second line of text.\n");
            writer2.close();  // Close the second writer

            System.out.println("Successfully appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
