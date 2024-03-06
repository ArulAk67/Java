import java.util.Scanner;

public class permutation {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int []temp=new int[k];
        int j=0;
        long sum=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>n-k){
                temp[j++]=i;
                sum+=(long)a[i];
            }
        }
        long ans=1;
        if(k==1)
            System.out.print(n+" "+1);
        else
        {
            for(int i=1;i<k;i++)
                ans=(ans*(long)(temp[i]-temp[i-1]))%998244353;
            
            System.out.print(sum+" "+ans);
        }
    }
}    
