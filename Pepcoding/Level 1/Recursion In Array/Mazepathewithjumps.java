import java.io.*;
import java.util.*;
public class Mazepathewithjumps {

    public static void main(String[] args) throws Exception {
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    ArrayList<String> al=new ArrayList<>();
    al=getMazePaths(0,0,n-1,m-1);
    System.out.println(al);
    
    
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        
        ArrayList<String> mr= new ArrayList<>();
        if(sc==dc&&sr==dr){
            mr.add("");
            return mr;
        }
        if(sr>dr||sc>dc){
            return new ArrayList<>();
        }
        
        for(int jump=1;jump<=dc-sc;jump++){
            ArrayList<String> rr=getMazePaths(sr,sc+jump,dr,dc);
            for(int i=0;i<rr.size();i++){
                mr.add("h"+jump+rr.get(i));
            }
            
        }
        for(int jump=1;jump<=dr-sr;jump++){
            ArrayList<String> rr=getMazePaths(sr+jump,sc,dr,dc);
            for(int i=0;i<rr.size();i++){
                mr.add("v"+jump+rr.get(i));
            }
            
        }
        
        for(int jump=1;jump<=Math.min(dr,dc);jump++){
            ArrayList<String> rr=getMazePaths(sr+jump,sc+jump,dr,dc);
            for(int i=0;i<rr.size();i++){
                mr.add("d"+jump+rr.get(i));
            }
            
        }
        
        
        return mr;
    }

}
