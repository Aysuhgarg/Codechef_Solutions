import java.util.*;
import java.lang.*;
public class strong {
 
    public static int factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static boolean isstrong(int n)
    {
        int sum=0,nn=n;
        while(n>0)
        {
            int r=n%10;
            sum=sum+factorial(r);
            n=n/10;
        }
        if(sum== nn)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n;
        n=sc.nextInt();
        if(isstrong(n)==true)
        {
            System.out.println("Number is strong");
        }
        else
        {
            System.out.println("Number is not strong");
        }
    }
}
