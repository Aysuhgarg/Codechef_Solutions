import java.util.*;
public class Floyds_triangle {
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
               System.out.print(++k+" ");
            }
            System.out.println();
        }
    }
}

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i = 0;i < n;i++){
            int val = 1;
            for(int j = 0;j <= i;j++){
                System.out.print(val + "\t");
                val = (val *(i - j))/(j +1);
            }
            System.out.println();
        }
    }
}
