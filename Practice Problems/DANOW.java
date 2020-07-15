Problrm Statement----------->https://www.codechef.com/problems/DANOW

---------------------->Solution<---------------------------
import java.util.Scanner;
class Solution {
  public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
    int n=sc.nextInt();
     int q=sc.nextInt();
     long[] a= new long[n];
     long[] b= new long[n];
     for(int i=0;i<n;i++) a[i]=sc.nextInt();
     for(int i=0;i<n;i++) b[i]=sc.nextInt();
     long sum = 0;
     for(int i=0;i<q;i++){
      int l=sc.nextInt();
      int r=sc.nextInt();
      sum = 0;
      for(int j=l-1;j<=r-1;j++){
        sum = sum + a[j]*b[j];
      }
      System.out.println(sum);
     }
    }
    }
}