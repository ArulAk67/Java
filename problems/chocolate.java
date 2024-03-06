import java.util.Scanner;

public class chocolate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long com=1;
        int f=-1;
        int c=0;
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            if(a==1 && f==-1)
            {
                f=i;
            }
            else if(a==1)
            {
                com=com*(int)(i-f);
                f=i;
            }
            if(a==0)
             c++;
        }
        if(c!=n)
        System.out.print(com);
        else
        System.out.print(0);
    }
}
