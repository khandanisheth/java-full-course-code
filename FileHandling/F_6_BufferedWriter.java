import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class F_6_BufferedWriter {
    public static void main(String[] args) {
        try {
            // FileWriter bina append mode ke (overwrite karega)
            FileWriter fw = new FileWriter("Test.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            // Naya data likhna (purana data delete ho jayega)
            bw.write("This is new content.");
            bw.newLine();
            bw.write("Old data is now replaced.");

            bw.close(); // File close karna zaroori hai

            FileWriter fww = new FileWriter("Test.txt", true); // Append mode ON
            BufferedWriter bww = new BufferedWriter(fww);
            bww.write("This is appended content.");
            bww.newLine();
            bww.close();

            System.out.println("File writing completed (Old data overwritten).");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
