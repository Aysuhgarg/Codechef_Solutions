import java.util.*;
public class hcf {
    public static int hcf(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        int ans=hcf(b,a%b);
        return ans;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n2=sc.nextInt();
        int ans =hcf(n,n2);
        System.out.println(ans);
    }
}
