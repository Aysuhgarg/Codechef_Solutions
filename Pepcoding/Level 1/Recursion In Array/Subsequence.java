// Using ArrayList

import java.io.*;
import java.util.*;

public class Subsequence {

    public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner (System.in);
    String str;
    str=sc.next();
    System.out.println(gss(str));
    }

    public static ArrayList<String> gss(String str) {
        
        if(str.length()==0)
        {
            ArrayList<String> nn=new ArrayList<>();
            nn.add("");
            return nn;
        }
        ArrayList<String> rr1=new ArrayList<>();
        ArrayList<String> rr2=new ArrayList<>();
        ArrayList<String> my=new ArrayList<>();
        char ch=str.charAt(0);
        String ros=str.substring(1);
        rr1=gss(ros);
        rr2=gss(ros);
        
        for(int i=0;i<rr2.size();i++)
        {
            my.add(rr2.get(i));
        }
        for(int i=0;i<rr1.size();i++)
        {
            my.add(ch+rr1.get(i));
        }
        return my;
    }

}