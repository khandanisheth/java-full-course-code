import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class F_5_BufferReader {
    public static void main(String[] args) throws IOException {
        // FileReader ka object banaya jo file ko read karega
        FileReader fileReader = new FileReader("Check.txt");

        // BufferedReader ka object banaya jo fileReader se data lega
        BufferedReader br = new BufferedReader(fileReader);

        String line;

        // Jab tak file me data hai tab tak readLine() call hota rahega
        while ((line = br.readLine()) != null) {
            System.out.println(line); // Line ko print karna
        }

        // BufferedReader ko close karna zaroori hai
        br.close();

        /*
         * 📌 Explanation:
         * FileReader fileReader = new FileReader("Check.txt");
         * FileReader ka object banaya jo file ko read karega.
         * BufferedReader br = new BufferedReader(fileReader);
         * BufferedReader ka object banaya jo FileReader ke data ko buffer me store
         * karega.
         * readLine()
         * Har baar ek line read karta hai aur null return karta hai jab file end hoti
         * hai.
         * Loop chalaya jab tak readLine() null return na kare.
         * File close karna zaroori hota hai taaki resources free ho sakein.
         * 
         * 
         * 3. BufferedReader Methods (Jo Commonly Use Hote Hain)
         * Method Description
         * read() Ek character read karta hai (ASCII value return karta hai)
         * readLine() Ek line read karta hai (String return karta hai)
         * ready() Check karta hai ki file ready hai ya nahi read karne ke liye (boolean
         * return karta hai)
         * skip(n) n characters skip karta hai
         * close() Stream close karta hai
         */
    }
}
