
public class Reverse {
    public static void revefun(StringBuffer strfun) {
        for (int i = 0; i < strfun.length() / 2; i++) {
            int front = i;
            int back = strfun.length() - i - 1;
            char firstchar = strfun.charAt(front);
            char lastchar = strfun.charAt(back);
            strfun.setCharAt(front, lastchar);
            strfun.setCharAt(back, firstchar);
        }
        System.out.println(strfun);
    }

    public static void main(String[] args) {
        /* 1. Reverse using a for loop and concatenation */
        String name = "sohil";
        String reversed = "";
        for (int i = 0; i < name.length(); i++) {
            reversed = name.charAt(i) + reversed;
        }
        System.out.println(reversed);

        /* 2. Reverse using StringBuffer */
        StringBuffer stname = new StringBuffer("Khan");
        String rename = stname.reverse().toString();
        System.out.println(rename);

        /* 3. Reverse using a for loop and character array */
        char[] charre = "khan Danish".toCharArray();
        String charrename = " ";
        for (int i = 0; i < charre.length; i++) {
            charrename = charre[i] + charrename;
        }
        System.out.println(charrename);

        /* 4. Reverse using a custom StringFormatter class */
        String formetname = "Arbaz";
        System.out.println(StringFormatter.reverseString(formetname));
        System.out.println(StringFormatter.reverseString("my name is khan"));
        System.out.println(StringFormatter.reverseString("I am sonoo jaiswal"));

        /*
         * 5. Reverse using a Create StringBuffer Fun() DivedAndConqer Rules
         * fnt bk ftchar ltchar setCAt(ft, ltchar); setCAt(bk, ftchar);
         * 0 5 o o 0->O 5->O
         * 1 4 h l 1->l 4->h
         * 2 3 e l 2->l 3->e
         */
        StringBuffer ggg = new StringBuffer("Ohello");
        revefun(ggg);
    }
}

class StringFormatter {
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
