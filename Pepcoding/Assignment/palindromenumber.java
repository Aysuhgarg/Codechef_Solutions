import java.util.*;
import java.lang.*;
public class palindromenumber {
    public static int reverse(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        rev=reverse(n);
        if(rev== n)
        {
            System.out.println("Number is palindrom");
        }
        else
        {
            System.out.println("Number is not palindrom");
        }
    }
}
