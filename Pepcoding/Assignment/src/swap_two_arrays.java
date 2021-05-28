import java.util.*;
public class swap_two_arrays {    // Question 37
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter size of array a");
      int n1=sc.nextInt();
      int a[]=new int[n1];
      System.out.println("Enter the array element");
      for(int i=0;i<n1;i++)
      {
          a[i]=sc.nextInt();
      }

      System.out.println("Enter size of array b");
      int n2=sc.nextInt();
      int b[]=new int[n2];
      System.out.println("Enter the array element");
      for(int i=0;i<n1;i++)
      {
          b[i]=sc.nextInt();
      }

      System.out.println("Before swaping");
      System.out.print("Value of a is = ");
      for(int i=0;i<n1;i++)
      {
        System.out.print(a[i] +" ");
      }
      System.out.println();
      System.out.print("Value of b is = ");
      for(int i=0;i<n1;i++)
      {
        System.out.print(b[i] +" ");
      }
      System.out.println();
      int temp[]=new int[Math.max(n1,n2)];
      temp=a;
      a=b;
      b=temp;
     
    
      System.out.println("After swaping");
      System.out.print("Value of a is = ");
      for(int i=0;i<n1;i++)
      {
        System.out.print(a[i] +" ");
      }
      System.out.println();
      System.out.print("Value of b is = ");
      for(int i=0;i<n1;i++)
      {
        System.out.print(b[i] +" ");
      }
      System.out.println();
    }
}
