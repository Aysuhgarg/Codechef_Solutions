import java.util.*;
public class evenodd {
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n;
    n=sc.nextInt();
    if((n&1)==1)
    {
        System.out.println("Number is odd");
    }
    else
    {
        System.out.println("Number is even");
    }
}    
}
