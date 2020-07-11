//Problem Statement--------------> https://www.codechef.com/problems/NCR19

--------------------------->Solution<-----------------
/* package codechef; // don't place package name! */
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static int hextodecimal(String s)
    {
             String digits = "0123456789ABCDEF";
             s = s.toUpperCase();
             int val = 0;
             for (int i = 0; i < s.length(); i++)
             {
                 char c = s.charAt(i);
                 int d = digits.indexOf(c);
                 val = 16*val + d;
             }
             return val;
    }
    public static void main(String args[])
    {
        int a;
        String str;
        int num;
        Scanner scan = new Scanner(System.in);
		
        a=scan.nextInt();
        str = scan.next();
		
        num = hextodecimal(str);
		
        System.out.println(num);
    }
       	
}


