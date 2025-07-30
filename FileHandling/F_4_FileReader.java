import java.io.FileReader;
import java.io.IOException;

public class F_4_FileReader {
    public static void main(String[] args) {
        try {
            // "Check.txt" file ko read karne ke liye FileReader object banaya gaya hai
            FileReader reader = new FileReader("Check.txt");

            // Pehle character ko read karke uski ASCII value print karega
            System.out.println(reader.read());

            // Dusre character ko read karke usko character ke roop mein print karega
            System.out.println((char) reader.read());

            int character; // Variable jo ek-ek character ko store karega

            // Jab tak file ke end tak nahi pahunche, ek-ek character read aur print karega
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            // File ko close karna zaroori hai, taki resources free ho sakein
            reader.close();
        } catch (IOException e) {
            // Agar koi error aati hai (jaise file na mile), to yeh message print hoga
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace(); // Error details ko print karega
        }
    }
}

/*
 * Kya reader.read() character ko delete karta hai?
 * ❌ Nahi!
 * Ye sirf character ko read karta hai, delete nahi karta.
 * Lekin ek baar koi character read ho gaya, to phir wapas usi character ko read
 * nahi kiya ja sakta kyunki cursor aage badh chuka hota hai.
 */
