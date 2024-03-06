//  Problem statement

// Ben loves ciphers.He has invented his own cipher called recreate. Recreate cipher is used for strings. To encrypt the string s=s1s2…sm (1≤m≤10), Polycarp uses the following algorithm:

// he writes down s1 ones,

// he writes down s2 twice,

// he writes down s3 three times,
//  ...

// he writes down sm m times.

// For example, if s="bab" the process is: "b" → "baa" → "baabbb". So the encrypted s="bab" is "baabbb".

// Given string t — the result of encryption of some string s. Your task is to decrypt it, i. e. find the string s.

// Input Format

// The first line contains integer n(1<=n<=55)— the length of the encrypted string. The second line of the input contains t — the result of encryption of some string ss. It contains only lowercase Latin letters. The length of it is exactly n. It is guaranteed that the answer to the test exists.

// Output Format

// Print such string ss that after encryption it equals y

// Constraints

// (1<=n<=55)

// Sample Input

// 6

// baabbb

// Sample Output

// bab

// Explanation

// if ss="bab" the process is: "b" →→ "baa" →→ "baabbb". So the encrypted ss="bab" is "baabbb"

// import java.util.Scanner;

// public class encrypted {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         // int n=sc.nextInt();
//         String s=sc.next();
//         String ans="";
//         int t=0,i=1;
//         while((t+i)<s.length())
//         {
//             ans+=s.charAt(t+i-1);
//             t=i-1;
//             i++;
//         }
//         System.out.println(ans);

//     }
// }

import java.util.Scanner;

public class encrypted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // int n = sc.nextInt();
        String t = sc.next();
        
        StringBuilder ans = new StringBuilder();
        int i = 0;
        
        while (i < t.length()) {
            ans.append(t.charAt(i));
            i += ans.length();
        }
        
        System.out.println(ans.toString());
    }
}

