import java.util.Scanner;

public class Kcp {

    public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner (System.in);
    String str;
    str=sc.next();
    printKPC(str,"");
    }

    public static void printKPC(String str,String asf) {
    String pad[] ={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    if(str.length()==0)
    {
        System.out.println(asf);
        return;
    }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        String ns=pad[ch-'0'];
        for(int i=0;i<ns.length();i++)
        {
            printKPC(ros,asf+ns.charAt(i));

        }
    }

}