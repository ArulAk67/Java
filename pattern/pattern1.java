class pattern1{
    public static void main(String arg[])
    {
        int n=5;
       for(int i=1;i<=n;i++)
      {
        for(int j=i;j<=n;j++)
        {
            System.out.print("  ");
        }
        for(int j=1;j<i;j++)
        {
            if(j==1 || i==n)
             System.out.print("* ");
            else
             System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                if(j==i || i==n)
                System.out.print("* ");
                else
                 System.out.print("  ");
        }
         System.out.print("\n");
     }
    }
}