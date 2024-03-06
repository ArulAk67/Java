// Problem statement 
 
// There are n boys and m girls going to museum . They should stand in a line so that boys and girls alternated there as much as possible. Let's assume that positions in the line are indexed from left to right by numbers from 1 to n + m. Then the number of integers i (1 ≤ i < n + m) such that positions with indexes i and i + 1 contain children of different genders (position i has a girl and position i + 1 has a boy or vice versa) must be as large as possible. Help the children and tell them how to form the line.

// Input Format
// The single line of the input contains two integers n and m (1 ≤ n, m ≤ 100), separated by a space.

// Output Format
// Print a line of n + m characters. Print on the i-th position of the line character "B", if the i-th position of your arrangement should have a boy and "G", if it should have a girl.
// Of course, the number of characters "B" should equal n and the number of characters "G" should equal m. If there are multiple optimal solutions, print any of them.

// **Constraints **
// (1 ≤ n, m ≤ 100)
// **Sample Input **
// 4 1
// Sample output:
// BGBBB

// 5      7
// BG BG BG BG BG GG


import java.util.Scanner;

public class boygirl_museum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        String ans="";
        if(n>m)
        {
            for(int i=0;i<m;i++)
                ans+="BG";
            for(int i=0;i<n-m;i++)
                ans+="B";
        }
        else
        {
            for(int i=0;i<n;i++)
                ans+="GB";
            for(int i=0;i<m-n;i++)
                ans+="G";
        }
        System.out.println(ans);
    }
}
