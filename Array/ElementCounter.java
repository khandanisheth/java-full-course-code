package Array;
public class ElementCounter {
    public static void main(String[] args) {
        int a[]={4,-2,8,7,0,-1};
        int n=0,p=0,e=0,o=0,z=0;

        for(int i = 0; i < a.length; i++) {
            if(a[i]==0)
            {
                z++;//Zero count
            }
             if(a[i]>=0)
            {
                p++;//Zero se big count positive
            }
             if(a[i]<=0)
            {
                n++;// count negtive
            }
             if(a[i]%2==0)
            {
                e++;//even count
            }
            else
            {
                o++;
            }
        }
        System.out.println(p+" "+""+n+" "+e+" "+o+" "+z);
    }
}
