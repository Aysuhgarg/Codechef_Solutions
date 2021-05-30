
import java.io.*;
import java.util.*;

public class get_maze_path {

    public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner (System.in);
    int n,m;
    n=sc.nextInt();
    m=sc.nextInt();
    
    System.out.println(getMazePaths(0,0,n-1,m-1));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        if(sr>dr || sc>dc)
        {
            return new ArrayList<String>();
        }
        if(dr==sr && dc==sc)
        {
            ArrayList<String> nn=new ArrayList<>();
            nn.add("");
            return nn;
        }
        ArrayList<String> r1=new ArrayList<>();
        ArrayList<String> r2=new ArrayList<>();
        ArrayList<String> ans=new ArrayList<>();
        r1=getMazePaths(sr,sc+1,dr,dc);
        r2=getMazePaths(sr+1,sc,dr,dc);
            for(int i=0;i<r1.size();i++)
            {
                ans.add("h"+r1.get(i));
            }
            for(int i=0;i<r2.size();i++)
            {
                ans.add("v"+r2.get(i));
            }
        return ans;
    }

}