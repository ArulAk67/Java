import java.util.*;
public class combination {
    public static int fact(int n)
    {
        int ans=1;
        for(int i=1;i<=n;i++)
        {
            ans*=i;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        n=n-k+1;
        int r=2;
        int ans=fact(n)/(fact(r)*fact(n-r));
        int t=((n-1)*n)/2;
        int min=n/k;
        int rem=n%k;
        int res = (k-rem)*(((min -1)*min) / 2) + rem * (((min+1)*min)/2);

        System.out.println(res);
    }
}
