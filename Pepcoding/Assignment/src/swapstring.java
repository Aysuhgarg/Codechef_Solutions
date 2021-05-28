import java.io.IOException;
import java.util.*;
public class swapstring {
    
    public static void main(String args[]) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        String st1="",st2="";
        st1=sc.nextLine();
        st2=sc.nextLine();
        String temp="";
        System.out.println("Before swapping");
        System.out.println("String 1 is ="+st1);
        System.out.println("String 2 is ="+st2);
        temp=st1;
        st1=st2;
        st2=temp;
        System.out.println("After swapping");
        System.out.println("String 1 is ="+st1);
        System.out.println("String 2 is ="+st2);
        
    }
}
