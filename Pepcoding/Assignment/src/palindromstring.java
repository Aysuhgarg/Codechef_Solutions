import java.util.*;
public class palindromstring {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int len=str.length();
        int start=0,end=len;
        while(start<=end)
        {
            if(str.charAt(start)==str.charAt(end-1))
            {
                start++;
                end--;
            }
            else
            {
                break;
            }
        }
        if(start>=end)
        {
            System.out.println("String is palindrom");
        }
        else
        {
            System.out.println("String  is not palindrom");
        }
    }
}





import java.util.*;
import java.io.*;

class Quadratic {

	static void findRoots(int a, int b, int c)
	{
				// If a is 0, then equation is not quadratic, but linear
		if (a == 0) {
			System.out.println("Invalid");
			return;
		}

		int d = b * b - 4 * a * c;
		double sqrt_val = Math.sqrt(Math.abs(d));

		if (d > 0) {
			System.out.println("Roots are real and different \n");
			System.out.println((double)(-b + sqrt_val) / (2 * a) + "\n"+
						(double)(-b - sqrt_val) / (2 * a));
		}
		else if (d == 0) {
			System.out.println("Roots are real and same \n");
			System.out.println(-(double)b / (2 * a) + "\n"+ -(double)b / (2 * a));
		}
		else // d < 0
		{
			System.out.println("Roots are complex \n");
			System.out.println(-(double)b / (2 * a) + " + i"+ sqrt_val + "\n"+
						 -(double)b / (2 * a)+ " - i" + sqrt_val);
		}
	}

	public static void main(String args[])
	{
        Scanner scn = new Scanner(System.in);
		int a = scn.nextInt(), b = scn.nextInt(), c = scn.nextInt();
	
		// Function call
		findRoots(a, b, c);
	}
}












import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    for(int i = 2;i <= 100;i++){
        if(isPrime(i)){
            System.out.println(i);
        }
    }
  }
   
   public static boolean isPrime(int n){
       for(int i = 2;i * i <= n;i++){
           if(n % i == 0){
               return false;
           }
       }
       return true;
   }
  }
