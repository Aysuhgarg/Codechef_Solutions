import java.util.*;
public class fibo_type2 {

    public static void  fiboiter(int n)
    {
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        if(n<3)
        {
            for(int i=0;i<n;i++)
            System.out.print(dp[i]+" ");
        }
        else
        {
            for(int i=3;i<n;i++)
            {
                dp[i]=dp[i-1]+dp[i-2];
            }
            for(int i=0;i<n;i++)
            System.out.print(dp[i]+" ");
        }
    }

    static int n1=0,n2=1,n3=0;    
    static void fiborec(int n){    
       if(n>0){    
            n3 = n1 + n2;    
            n1 = n2;    
            n2 = n3;    
            System.out.print(" "+n3);   
            fiborec(n-1);    
        }    
    }    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Using iteration");
        fiboiter(n);
        System.out.println();
       System.out.println("Using recursion");
       System.out.print(n1+" "+n2);  
       fiborec(n-2);
    }
}



import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      iteration(n);
      System.out.println(recursion(n));
   }
   

// Using Iteration

   public static void iteration(int n){
    int factorial = 1;
      
      for(int i = 1;i <= n;i++){
        factorial  *= i;
      }
      System.out.println(factorial);
   }
   
   
   
// Using Recursion

   public static int recursion(int n){
       if(n == 0){
           return 1;
       }
       int ans = recursion(n - 1);
       ans *= n;
       return ans;
   }
  }






  import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
      iteration(n1,n2);
      recursion(n1,n2);
     }
     

public static void iteration(int dvd,int div){
    while(dvd % div != 0){    //HCF by long division method
              int r = dvd % div;
              dvd = div;
              div = r;
      }
      
      int hcf = div;
      System.out.println(hcf);
}

public static void recursion(int dvd,int div){
    if(dvd % div == 0){
        System.out.println(div);
        return;
    }
    
    int r  =dvd % div;
    recursion(div,r);
}
}
