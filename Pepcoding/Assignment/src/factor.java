import java.util.*;
class factor
{
    static void printDivisors(int n)
    {
        for (int i=1;i<=n;i++)
            if (n%i==0)
                System.out.print(i+" ");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        System.out.println("The divisors of numberare: ");
        printDivisors(n);
    }
}
