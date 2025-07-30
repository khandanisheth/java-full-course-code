 class som {
    int sum(int a,int b)
    {
        int x=a+b;
        return x;
    }
    float sum(float a,float b)
        {
            float x=a+b;
            return x;
        }

    void sum(int a,int b,int c)
    {
        int x=a+b+c;
        System.out.println(x);

    }
    public static void main(String [] args)
    {
        som s=new som();
        System.out.println(s.sum(20,40));
        System.out.println(s.sum(20,50));
        s.sum(98,50,45);

    }
    
}
