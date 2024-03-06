public class gcd {
    public static void main(String[] args) {
        int a=9,b=15;
        int gcd=hcf(a,b);
        // if(a==0 && b!=0)
        //     gcd=b;
        // else if(b==0 && a!=0)
        //     gcd=a;
        // else{
        //     while(a!=b)
        //     {
        //         int t=Math.max(a,b);
        //         int y=Math.min(a,b);
        //         a=t-y;
        //         b=y;
        //     }
        //     gcd=a;
        // }
        System.out.println("GCD "+gcd);
        System.out.print("LCM "+(a*b)/gcd);

        

    }
    public static int hcf(int a,int b){
        if(a==0 && b!=0)
            return b;
        else if(b==0 && a!=0)
            return a;
        else if(a>b)
            return hcf(a%b,b);
        else 
            return hcf(a,b%a);
    }
}
