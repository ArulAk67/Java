
// Problem statement

// During the break, the college students, boys and girls, formed a queue of n people in the canteen. Initially, the students stood in the order they entered the canteen. However, after a while the boys started feeling awkward for standing in front of the girls in the queue and they started letting the girls move forward each second

// Let's describe the process more precisely. Let's say that the positions in the queue are sequentially numbered by integers from 1 to n, at that the person in position number 1 is served first. Then, if at time x stands on the i-th position and a girl stands on the (i + 1)-th position, then at time x + 1 the i-th position will have a girl and the (i + 1)-th position will have a boy. The time is given in seconds.

// You've got the initial position of the students, at the initial moment of time. Determine the way the queue is going to look after t seconds.
// SAMPLE INP
// 5 1
// BGBGB
// OP:-
// GBGBB
 

// Explanation:
// After 1 second the string a is GBGBB




import java.util.Scanner;

public class boygirl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        String str =sc.next();
        
        char ch[]=str.toCharArray();
        for(int i=0;i<t;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(ch[j+1]=='G')
                {
                    ch[j+1]=ch[j];
                    ch[j]='G';
                    j++;
                }
            }
        }
        str = new String(ch);
        System.out.println(str); 
    }
}
