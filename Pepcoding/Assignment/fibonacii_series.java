import java.util.*;
public class fibonacii_series {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        if(n<3)
        {
            for(int i=0;i<n;i++)
            System.out.print(dp[i]+" ");
        }
        else
        {
            for(int i=3;i<n;i++)
            {
                dp[i]=dp[i-1]+dp[i-2];
            }
            for(int i=0;i<n;i++)
            System.out.print(dp[i]+" ");
        }
    }
}


import java.util.*;
class Test {
	// method to find factorial of given number
	static int factorial(int n)
	{Scanner scn = new Scanner(System.in);
		if (n == 0)
			return 1;

		return n * factorial(n - 1);
	}

	// Driver method
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(factorial(num));
	}
}
