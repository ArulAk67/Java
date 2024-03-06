import java.util.*;

public class linked_list
{
    static node ptr;
    static node head;  
    public static void insert(int x)
    {
       node temp=new node(x);
       if(head==null){
           head=temp;
           ptr=head;
       }
       else{
        ptr.next=temp;
        ptr=ptr.next;
       }
    }
   public static void main(String arg[])
   {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=0;i<n;i++)
      {
        insert(sc.nextInt());
      }
      sc.close();
      while(head!=null)
      {
        System.out.println(head.data);
        head=head.next;
      }
   }
}
class node
{
    int data;
    node next;
    node (){}
    node(int x)
    {
      data=x;
    }
}