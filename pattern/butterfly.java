public class butterfly {
    public static void main(String arg[]) {
        int n=5;
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int j=i;j<n;j++)
            {
                System.out.print("  ");
            }
            for(int j=i;j<n;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<i;j++)
            {
                System.out.print("  ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print("* ");
            }
            
            System.out.print("\n");
        }
        
    }
}
