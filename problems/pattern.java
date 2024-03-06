import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char pat[][]=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                pat[i][j]=sc.next().charAt(0);
            }
        }
        char di=pat[0][0];
        char adi=pat[0][1];

        System.out.println(di+""+adi);
        if(di==adi){
            System.out.print("NO");
            return;
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j && pat[i][j]!=di)
                {
                    
                    System.out.println("NO");
                    return;
                }
                else if((i+j == n-1) && pat[i][j]!=di ) 
                {
                    System.out.println("NO");
                    return;
                }
                else if(i!=j && (i+j !=n-1) && pat[i][j]!=adi)
                {
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.print("YES");

    }
}
