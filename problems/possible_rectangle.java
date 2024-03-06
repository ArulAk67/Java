import java.util.Scanner;

public class possible_rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==1)
        {
            System.out.println(0);
        }
        else{
            int c=n/2;
            System.out.print((c-1)/2);
        }
    }
}
