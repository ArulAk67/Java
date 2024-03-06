import java.util.Arrays;
import java.util.Scanner;

public class prefix_of_substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        String tmp="";
        int arr[][]=new int[n-1][3];
        for(int i[]:arr)
        {
            Arrays.fill(i, 0);
        }
        for(int i=0;i<n-1;i++)
        {
            tmp+=str.charAt(i)+"";
            int len=tmp.length();
            // System.out.println(tmp);
            for(int j=1;j<=n-len;j++)
            {
                String x=str.substring(j,j+len);
                if(x.compareTo(tmp)==0)
                    arr[i][1]++;
                if(x.compareTo(tmp)>0)
                    arr[i][0]++;
                if(x.compareTo(tmp)<0)
                    arr[i][2]++;
            }
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        return;
    }
}
