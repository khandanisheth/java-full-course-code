import java.io.FileWriter;
import java.io.IOException;

public class F_3_Write {// ** Es Class me Data Dal Dethe He tho data Override kar dethe he
    public static void main(String[] args) {
        try {
            // First FileWriter (overwrite mode by default)
            FileWriter writer1 = new FileWriter("Check.txt");
            writer1.write("First line of text.");
            writer1.append("Danish Khan");
            writer1.close(); // Close the first writer

            // Second FileWriter (overwrite mode by default)
            FileWriter writer2 = new FileWriter("Check.txt");
            writer2.append("Danish Khan \n");
            writer2.write("Second line of text.");
            writer2.close(); // Close the second writer

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
/*
 * 
 * Scenario 1: Multiple FileWriter Objects (Without Append Mode)
 * Agar aap multiple FileWriter objects use karte ho bina append mode ke (i.e.,
 * bina true argument ke), toh last created FileWriter object file ko overwrite
 * karega, aur jo pehle likha gaya data tha woh replace ho jayega. Matlab, jab
 * aap ek FileWriter se likhte ho, uska content overwrite ho jata hai, aur jab
 * doosra FileWriter se likhte ho, pehle ka data loss ho jata hai.
 */