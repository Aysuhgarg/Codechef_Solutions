import java.util.*;
public class GCD {
    public static int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        int ans=gcd(b,a%b);
        return ans;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n2=sc.nextInt();
        int ans =gcd(n,n2);
        System.out.println(ans);
    }
}
