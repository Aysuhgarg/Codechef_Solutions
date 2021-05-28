import java.util.*;
public class swap_two_numbers {  // Question 35
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a,b;
      a=sc.nextInt();
      b=sc.nextInt();
      System.out.println("Before swaping");
      System.out.println("Value of a is = "+ a );
      System.out.println("Value of b is = "+ b );
      int temp=a;
      a=b;
      b=temp;
      System.out.println("After swaping");
      System.out.println("Value of a is = "+ a );
      System.out.println("Value of b is = "+ b );
    }
}
