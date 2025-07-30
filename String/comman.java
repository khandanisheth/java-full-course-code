public class comman {
    public static void main(String[] args) {
        String a = "programming";
        int n1 = a.length();
        for (int i = 0; i < n1; i++) {
            boolean x = false;
            for (int j = 0; j < n1; j++) {
                if (i != j && a.charAt(i) == a.charAt(j)) {
                    x = true;
                    break;
                }
            }
            if (x) {// !x=>poain
                System.out.print(a.charAt(i) + " ");
            }
        }
    }
}
