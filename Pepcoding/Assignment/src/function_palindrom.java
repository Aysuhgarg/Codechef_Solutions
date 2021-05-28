import java.util.*;
public class function_palindrom {  
    public static void pali(String str)
    {
        int start=0,end=str.length();

        while(start<=end)
        {
            if(str.charAt(start)==str.charAt(end-1))
            {
                start++;
                end--;
            }
            else
            {
                break;
            }
        }
        if(start>=end)
        {
            System.out.println("String is palindrom");
        }
        else
        {
            System.out.println("String  is not palindrom");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str="";
        str=sc.nextLine();
        pali(str);
    }
}
