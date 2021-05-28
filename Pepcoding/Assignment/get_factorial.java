import java.util.*;
import java.lang.*;
public class get_factorial {
    public static double getfactorial(int n)
    {
        double fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n;
        n=sc.nextInt();
        System.out.println(getfactorial(n));
    }
}
