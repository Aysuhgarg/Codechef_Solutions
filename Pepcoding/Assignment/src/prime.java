
import java.util.*;
import java.lang.*;
public class prime {
    public static boolean isprime(int n)
    {
      for(int i=2;i*i<=n;i++)
      {
          if(n%i==0)
          {
              return false;
          }
      }
      return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n;
        n=sc.nextInt();
        if(isprime(n)==true)
        {
            System.out.println("Number is prime");
        }
        else
        {
            System.out.println("Number is not prime");
        }
    }
}
