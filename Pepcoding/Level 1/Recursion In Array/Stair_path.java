//Stair Path problem
import java.util.*;
public class Stair_path {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner (System.in);
        int n;
        n=sc.nextInt();
        System.out.println(getStairPaths(n));
       }
   
       public static ArrayList<String> getStairPaths(int n) {
           
           if(n<=0)
           {
                ArrayList<String> nn=new ArrayList<String>();
                nn.add("");
                return nn;
           }
           ArrayList<String> ans1=getStairPaths(n-1);
           ArrayList<String> ans2=getStairPaths(n-2);
           ArrayList<String> ans3=getStairPaths(n-3);
           
           ArrayList<String> rr=new ArrayList<String>();
           if(n>=1){
           for(int i=0;i<ans1.size();i++)
           {
               rr.add("1"+ans1.get(i));
           }}
            if(n>=2){
           for(int i=0;i<ans2.size();i++)
           {
               rr.add("2"+ans2.get(i));
           }}
            if(n>=3){
           for(int i=0;i<ans3.size();i++)
           {
               rr.add("3"+ans3.get(i));
           }}
           return rr;
       }
}
