import java.util.*;
import java.io.*;
import java.lang.*;
public class perfect {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sq=(int) Math.sqrt(n);
        if(sq*sq == n)
        {
            System.out.println("YES number is perfect number");
        }
        else
        {
            System.out.println("NO number is not perfect number");
        }
    }
}
