import java.util.Scanner;

class CountWords {

    // Method to count the number of words in the given input string
    static int countWords(String input) {
        // Split the string by space
        String[] words = input.split(" ");

        // Return the number of words
        return words.length;
    }

    public static void main(String args[]) {
        // Reading input from the user
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // Call the countWords function and get the output
        int output = countWords(input);

        // Print the result
        System.out.println(output);
        sc.close();
    }
}
/*
 * split() method ka kaam:
 * Jab aap split(" ") method use karte hain, toh yeh string ko spaces ke hisaab
 * se tod deta hai, aur har word ko ek alag element ke roop mein ek array ya
 * list mein daal deta hai.
 * Agar delimiter split(" ") hai, toh space ko ek boundary ke roop mein treat
 * kiya jata hai aur string ko parts mein split kiya jata hai.
 * 
 * Yahan str wo string hai jise aap split karna chahte hain.
 * " " (single space) is delimiter hai, jiske basis pe string ko todha jayega.
 */