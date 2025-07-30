
public class EqualsDemo  {

    @SuppressWarnings("unlikely-arg-type")
    public static void main(String[] args) {
        String str1 = new String("InterviewBit");
        String str2 = "InterviewBit";
        String str3 = "InterviewBit";

        System.out.println(str1 == str2); // Comparing references, should print false
        System.out.println(str3 == str2); // Comparing references, should print true
        System.out.println(str1.equals(str2)); // Comparing values, should print true
        System.out.println(str3.equals(str2)); // Comparing values, should print true

        System.out.println("\n\n");

        StringBuffer str4 = new StringBuffer("InterviewBit");
        StringBuffer str5 = new StringBuffer("InterviewBit");

        System.out.println(str4 == str5); // Comparing references, should print false
        // The following line will throw an error:
        System.out.println(str4.equals(str2)); // str4 is a StringBuffer, str2 is a String
        // The following line will also throw an error:
        System.out.println(str4.equals(str5)); // str4 and str5 are StringBuffers, not Strings


        System.out.println("\n");

        System.out.println(str4.toString().equals(str2)); // Compare content, should print true
        System.out.println(str4.toString().equals(str5.toString())); // Compare content, should print true




        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = sb1;  // Same reference
        StringBuffer sb3 = new StringBuffer("Hello");

        System.out.println(sb1 == sb2);   // true (same memory address)
        System.out.println(sb1 == sb3);   // false (different memory address)



        //Solution: Agar StringBuffer ka content compare karna ho, to toString() use karo:java
        System.out.println(sb1.toString().equals(sb2.toString())); // true (content comparison)

    }
}/*
String s1 = "Hello";
String s2 = "Hello";
String s3 = new String("Hello");



Heap Memory:  
New Keyword "Hello" Object  <-- s3 (Different address)

String Pool: simple
"Hello"  <-- s1, s2 (Same address)



String s4 = new String("Hello").intern();



Heap Memory:  
New "Hello" Object  <-- s3 (Different address)

String Pool:
"Hello"  <-- s1, s2, s4 (Same address after intern)







 Key Takeaways (Main बात):
String literals String Pool में स्टोर होते हैं और same value के लिए same address share करते हैं।
new String() हमेशा Heap Memory में नया object बनाएगा।
intern() method Heap के object को String Pool के object से जोड़ देता है।
== Operator reference (address) compare करता है, जबकि equals() content compare करता है।
💡 अगर performance चाहिए, तो हमेशा String literals यूज़ करो, new String() तभी यूज़ करो जब modification ज़रूरी हो।

*/
