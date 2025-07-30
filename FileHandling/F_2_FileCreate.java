import java.io.File;
import java.io.IOException;

public class F_2_FileCreate {
    public static void main(String[] args) {
        File fCreate = new File("Check.txt");
        File fCreate1 = new File("Append.txt");

        // File Create Method - ye check karega agar file successfully create hui hai ya
        // nahi
        try {
            if (fCreate.createNewFile()) { // Agar file successfully create hoti hai
                System.out.println("File created successfully!");
            } else {
                System.out.println("File already exists!");
            }
        } catch (IOException e) {
            // Agar file creation mein koi error hota hai
            e.printStackTrace();
        }

        try {
            if (fCreate1.createNewFile()) { // Agar file successfully create hoti hai
                System.out.println("File created successfully!");
            } else {
                System.out.println("File already exists!");
            }
        } catch (Exception e) {
            // Agar file creation mein koi error hota hai
            e.printStackTrace();
        }
    }
}
