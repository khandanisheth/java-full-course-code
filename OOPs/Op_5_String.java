

class OP_3_String {
        public static void main(String[] args) {
                String s1 = "java";// creating string by Java string literal
                char ch[] = { 's', 't', 'r', 'i', 'n', 'g', 's' };
                String s2 = new String(ch);// converting char array to string
                String s3 = new String("example");// creating Java string by new keyword
                System.out.println(s1);
                System.out.println(s2);
                System.out.println(s3);

                /* Java String compare */
                String a = "danish";
                String b = new String("danish");
                if (a == b) {
                        System.out.println("true");
                } else {
                        System.out.println("false");
                }
                System.out.println(a.equals(b));
                System.out.println();
                System.out.println();
                System.out.println();
                /* String Concatenation in Java */
                String con = 50 + 30 + "String Concatenation in Java";
                System.out.println(con);
                /* 2. String StringBuffer concatenation append() */
                StringBuffer con1 = new StringBuffer("Danish");
                StringBuffer con2 = new StringBuffer("khan");
                StringBuffer cons = con1.append(con2);
                System.out.println(cons);
                /* 2. String concatenation using format() method */
                String for1 = new String("Hello"); // String 1
                String for2 = new String(" World"); // String 2
                String forc = String.format("%s%s", for1, for2);
                System.out.println(forc);
                /* 3. String concatenation using String.join() method (Java Version 8+) */
                String join1 = new String("Hello"); // String 1
                String join2 = new String(" World"); // String 2
                String joinc = String.join("", join1, join2); // String 3 to store the result
                System.out.println(joinc.toString()); // Displays result
                /* Substring in Java */
                /* Example of Java substring() method */
                String s = "SachinTendulkar";
                System.out.println("Original String: " + s);
                System.out.println("Substring starting from index 6: " + s.substring(6));// Tendulkar
                System.out.println("Substring starting from index 0 to 6: " + s.substring(0, 6)); // Sachin
                /* Java String toUpperCase() and toLowerCase() method */
                String Case = "Sachin";
                System.out.println(Case.toUpperCase());// SACHIN
                System.out.println(Case.toLowerCase());// sachin
                System.out.println(Case);// Sachin(no change in original)
                /* Java String trim() method */
                String trim = "  Sachin  khan";
                System.out.println(trim);// Sachin Orignel
                System.out.println(trim.trim());// Sachin
                /* Java String charAt() Method */
                String charAt = "Sachin";
                System.out.println(s.charAt(0));// S
                System.out.println(s.charAt(3));// h
                for (int i = 0; i < charAt.length(); i++) {
                        System.out.println(s.charAt(i));
                }
                /* Java String replace() Method */
                String replace = "Java is a programming language. Java is a platform. Java is an Island.";
                String replaceString = replace.replace("Java", "Kava");// replaces all occurrences of "Java" to "Kava"
                System.out.println(replaceString);
        }
}
