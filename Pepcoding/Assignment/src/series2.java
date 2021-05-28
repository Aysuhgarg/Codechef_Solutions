import java.util.*;
public class series2 {
    
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sign=-1,sum=0;
        for(int i=1;i<=n;i++)
        {
            sign=sign*(-1);
            sum=sum+(sign*i);
            System.out.print(sign*i+" ");
        }
        System.out.println();
        System.out.println("Sum of series is = "+sum);
    }
}

