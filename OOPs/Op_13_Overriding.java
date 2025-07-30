class rr {
    void sss() {
        System.out.println("prents Non static Method 1");
    }

    static void ssss() {
        System.out.println(" prents  static Method 2");
    }

}

class verriding extends rr {
    @SuppressWarnings("static-access")
    void sss() {
        super.sss();
        super.ssss();
        System.out.println("child  Non static Method 3");
        this.ssss();
    }

    @SuppressWarnings("static-access")
    static void ssss() {
        rr r = new rr();
        System.out.println(" child  static Method 4");
        r.sss();
        r.ssss();
        System.out.println(" child  static Method 4");
    }

    public static void main(String[] args) {
        verriding vr = new verriding();
        vr.sss();

    }
}
