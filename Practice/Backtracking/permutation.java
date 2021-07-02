import java.io.IOException;
import java.util.*;
public class permutation {
    public static void main(String args[]) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();

        printall(n,"");
    }

    public static void printall(String n,String asf)
    {
        if(asf.length()==3)
        {
            System.out.println(asf); return;
        }
        for(int i=0;i<n.length();i++)
        {
            char ch=n.charAt(i);
            String nstr=n.substring(0,i)+n.substring(i+1);
            printall(nstr,asf+ch);
        }
    }
}
