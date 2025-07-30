package LambdaExpression;

class Animal {
    protected void show1() {
        System.out.println("Animal protected  \n");
    }

    public void show11() {
        System.out.println("Animal public \n");
    }

    void show111() {
        System.out.println("Animal Deafult \n");
    }

    // private void show1111() {
    // System.out.println("Animal public \n"); /// Do not access
    // }

}

public class Le_7_NormalAnonymousClass{
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            protected void show1() {
                
                System.out.println(" protected \n This Normal Anonymous Class Create this \n");
            }

            @Override
            public void show11() {
                System.out.println(" public\n This Normal Anonymous Class Create this \n");
            }

            @Override
            void show111() {
                System.out.println(" Deafult \n This Normal Anonymous Class Create this \n");
            }
            
        };

        // Le_7_NormalAnonymousClass aaa = new Le_7_NormalAnonymousClass() {
        //     @Override
        //     protected void show1() {
        //         System.out.println(" protected \n This Normal Anonymous Class Create this \n");
        //     }

        //     @Override
        //     public void show11() {
        //         System.out.println(" public\n This Normal Anonymous Class Create this \n");
        //     }

        //     @Override
        //     void show111() {
        //         System.out.println(" Deafult \n This Normal Anonymous Class Create this \n");
        //     }
        // };

        a.show1();
        a.show11();
        a.show111();
        

        // aaa.show1();
        // aaa.show11();  // jab me ese extends kartha hu tab error nhi aathi jab nhi kartha tho error aathi 
        // aaa.show111();

        System.out.println("\n\n This With Object Use ok ");
        Animal aa = new Animal();
        aa.show1();
        aa.show11();
        aa.show111();
    }
}
