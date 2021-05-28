import java.util.*;
public class reverse_any_number {
    public static int reverse(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int ans=reverse(n);
       System.out.println(ans);
    }
}


import java.util.*;
   
   public class sum{
   
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
   }




   import java.util.*;
   
   public class power{
   
   public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int exp = scn.nextInt();
        int power = 1;
        while(exp > 0){
            power *= n;
            exp--;
        }
        System.out.println(power);
    }
   }

   import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int first = scn.nextInt();
        int second = scn.nextInt();
        int sum = first - (- second);
        System.out.println(sum);
    }
   }

   import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int first = scn.nextInt();
        int second = scn.nextInt();
        int negSecond = ~second + 1;   //2's Complement
        int sub = first + negSecond;
        System.out.println(sub);
    }
   }
   import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int first = scn.nextInt();
        int second = scn.nextInt();
        int third = scn.nextInt();
        
        if(first - second >= 0 && first - third > 0){
            System.out.println(first);
        }else if(second - third > 0){
            System.out.println(second);
        }else{
            System.out.println(third);
        }
    }
   }

   import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int first = scn.nextInt();
        int second = scn.nextInt();
        int third = scn.nextInt();
        
        System.out.println((first >= second)?((first > third)? first : third) : (second > third) ? second : third);
    }
   }



import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        while(sum > 9){
            int temp = sum;
            sum = 0;
            while(temp > 0){
                sum += temp % 10;
                temp /= 10;
            }
        }
        System.out.println(sum);
    }
   }


   import java.util.*;

   public class Main{
   
   public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     for(int div = 2;div * div <= n;div++){
         while(n % div == 0){
         n = n/div;
         System.out.println(div + " ");
     }
     }
     
     if(n != 1)
     System.out.println(n + " ");
    }
   }



import java.util.*;

public class Main{

public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  int r = scn.nextInt();
  
  int ncr = fact(n)/(fact(r)*fact(n - r));
  
  System.out.println(ncr);
 }
 
 public static int fact(int n){
    if(n == 0){
        return 1;
    }
    
    int ans = fact(n - 1);
    ans *= n;
    return ans;
 }
}





import java.util.*;

public class Main{

public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
  String str = scn.nextLine();
  int ans = 0;
  boolean isNeg = false;
  for(int i = 0;i < str.length();i++){
      if(str.charAt(i) == '-'){
          isNeg = true;
          i++;
      }
      int ch = str.charAt(i) - '0';
      ans *= 10;
      ans += ch;
  }
  if(isNeg == true){
      ans = -ans;
  }
  System.out.println(ans);
 }
}



import java.util.*;

public class Main{

public static void main(String[] args) {
    print1To100(1);
  }
  public static void print1To100(int n){
      if(n > 100){
        return;
      }
      System.out.print(n + " ");
      print1To100(n + 1);
  }
}



   