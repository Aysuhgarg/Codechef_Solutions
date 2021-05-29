//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
//question no 17
import java.io.*;
import java.util.*;
public class Get_kpc {
    
        public static void main(String[] args) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        String n;
        n=sc.next();
        System.out.println(getkpc(n));
        }

    public static String pad[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

        public static ArrayList<String> getkpc(String str) {
            
            if(str.length()==1)
            {
                ArrayList<String> nn=new ArrayList<>();
                int n=str.charAt(0)-'0';
                for(int i=0;i<pad[n].length();i++)
                {
                    nn.add(pad[n].charAt(i)+"");
                }
                return nn;
            }
            char ch=str.charAt(0);
            String ros=str.substring(1);
            ArrayList<String> rr1=new ArrayList<>();
            ArrayList<String> my=new ArrayList<>();
              rr1=getkpc(ros);
            for(int j=0;j<pad[ch-'0'].length();j++)
            {
                
                for(int i=0;i<rr1.size();i++)
                {
                    my.add(pad[ch-'0'].charAt(j)+rr1.get(i));
                }
            }
            return my;
        }
    
    }
