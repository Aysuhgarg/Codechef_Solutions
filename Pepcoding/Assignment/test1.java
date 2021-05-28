// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class test1{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            char[] nuts = new char[n], bolts = new char[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                nuts[i] = (inputLine[i].charAt(0));
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                bolts[i] = (inputLine[i].charAt(0));
            }

            new Solution().matchPairs(nuts, bolts, n);
            for (int i = 0; i < n; i++) {
                System.out.print(nuts[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.print(bolts[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    void matchPairs(char nuts[], char bolts[], int n) {
        // code here
        HashMap<Character,Integer> hn=new  HashMap<>();
         HashMap<Character,Integer> hb=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(hn.containsKey(nuts[i])==true)
            {
                hn.put(nuts[i],hn.get(nuts[i])+1);
            }
            else{
            hn.put(nuts[i],1);}
        }
        
         for(int i=0;i<n;i++)
        {
            if(hb.containsKey(bolts[i])==true)
            {
                hb.put(bolts[i],hb.get(bolts[i])+1);
            }
            else{
            hb.put(bolts[i],1);}
        }
        char ans[]=new char[n];
        char order[]={'!','#','$','%','&','*','@','^','~'};
        int k=0,pos=0;
        while(k<9)
        {
            if( (hn.containsKey(order[k])==true) && (hb.containsKey(order[k])==true) )
            {
                ans[pos++]=order[k];
                if(hn.get(order[k])==1)
                {
                    hn.remove(order[k]);
                    k++;
                }
            }
            else
            {
                k++;
            }
        }
        
        for(int i=0;i<n;i++)
        {
            nuts[i]=ans[i];
            bolts[i]=ans[i];
        }
    }
}