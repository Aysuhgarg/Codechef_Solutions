import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class decimal_to_hexadecimal {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str="";
        while(n!=0)
        {
            int r=n%16;
            if(r==10)
            {
                str="A"+str;
            }
            else if(r==11)
            {
                str="B"+str;
            }
            else if(r==12)
            {
                str="C"+str;
            }
            else if(r==13)
            {
                str="D"+str;
            }
            else if(r==14)
            {
                str="E"+str;
            }
            else if(r==15)
            {
                str="F"+str;
            }
            else
            {
                str=r+str;
            }
            n=n/16;
        }
        System.out.println(str);
	}
}
