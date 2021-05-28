import java.util.*;
public class series {                         //  Question 64
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        float sum=0;
        for(int i=1;i<=n;i++)
        {
          sum=sum+(float)1/i;
          System.out.print("1/"+i+" ");
        }
        System.out.println();
        System.out.println("sum of series is "+sum);
    }
}
