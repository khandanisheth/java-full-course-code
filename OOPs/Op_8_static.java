class man {
    static String name;
    static int x;

    static void main(String name, int x) {
        System.out.println(name + " " + x);
    }
}

public class Op_8_static {
    static void st() {
        System.out.println("Hello " + name);
    }

    static String name = "ll";

    public static void main(String[] args) {
        String kk;
        kk = man.name = "kkk";
        int j;
        j = man.x = 84;

        man.main(kk, j);

        st();
    }
}
