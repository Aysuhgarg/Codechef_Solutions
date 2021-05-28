
import java.util.*;
import java.lang.*;
public class armstrong {

    public static boolean isarmstrong(int n)
    {
       int sum=0,nn=n;
       while(n>0)
       {
           int r=n%10;
           sum+=r*r*r;
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
        int n=sc.nextInt();
        if((isarmstrong(n))==true)
        {
            System.out.println("Number is armstrong");
        }
        else
        {
            System.out.println("Number is not armstrong");
        }
    }
}
