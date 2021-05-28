// import java.io.*;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=0;i<n;i++)
       System.out.println("hello world");
       sc.close();
    }
}


import java.util.*;
  public class Main{
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int dn = anyToany(n);
        System.out.println(dn);
   }   
   
    public static int anyToany( int n) {
     int nn = sourceToDecimal(n);
     int dec = decimalToDest(nn);
     return dec;
    }
  
 public static int sourceToDecimal(int n){
      int decimal = 0;
      for(int i = 0;n!= 0;i++){
          int r = n%10;
          n = n/10;
          decimal = decimal + (r *(int)Math.pow(8,i));
      }
      return decimal;
  }

  public static int decimalToDest(int n){
      int dest = 0;
      for(int i = 0;n!= 0;i++){
          int r = n%2;
          n = n/2;
          dest = dest + (r *(int)Math.pow(10,i));
      }
      return dest;
  }
 }

 import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int dn = anyToany(n);
        System.out.println(dn);
     
   }   
   
    public static int anyToany( int n) {
     int nn = sourceToDecimal(n);
     return nn;
    }
  
  
 public static int sourceToDecimal(int n){
      int decimal = 0;
      for(int i = 0;n!= 0;i++){
          int r = n%10;
          n = n/10;
          decimal = decimal + (r *(int)Math.pow(8,i));
      }
      return decimal;
  }
 
 }



 import java.util.*;

  public class Main{

  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String dn = anyToany(n);
        System.out.println(dn);
   }   
   

    public static String anyToany( int n) {
     int nn = sourceToDecimal(n);
     String dec = decimalToDest(nn);
     return dec;
    }
  

 public static int sourceToDecimal(int n){
      int decimal = 0;
      for(int i = 0;n!= 0;i++){
          int r = n%10;
          n = n/10;
          decimal = decimal + (r *(int)Math.pow(8,i));
      }
      return decimal;
  }


  public static String decimalToDest(int n){
      String sum = "";
       for(int i = 0;n !=0;i++){
           int r = n%16;
           n = n /16;
           if(r < 10){
               char temp = (char)(r + 48);
               sum = temp  +sum;
           }else{
               char temp = (char)(r + 55);
               sum = temp + sum;
           }
       }
       return sum;
  }
 }



 
import java.util.*;
public class Main{
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String n = scn.nextLine();
    int dn = anyToany(n);
    System.out.println(dn);
}   
   
 public static int anyToany( String str) {
     int nn = sourceToDecimal(str);
     int dec = decimalToDest(nn);
     return dec;
    }
  
 public static int sourceToDecimal(String str){
      int decimal = 0;
      for(int i = 0;str.length() != 0;i++){
          int r = 0;
          char ch = str.charAt(str.length() - 1);
          str = str.substring(0,str.length() - 1);
          if(ch > 64){
              r = (int)(ch - 55);
          }
        else{
              r = (int)(ch - 48);
          }
          decimal = decimal + (r *(int)Math.pow(16,i));
      }
      return decimal;
  }

public static int decimalToDest(int n){
      int dest = 0;
      for(int i = 0;n!= 0;i++){
          int r = n%2;
          n = n/2;
          dest = dest + (r *(int)Math.pow(10,i));
      }
      return dest;
  }

 }




 import java.util.*;
public class Main{
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String n = scn.nextLine();
    int dn = anyToany(n);
    System.out.println(dn);
}   
   
 public static int anyToany( String str) {
     int nn = sourceToDecimal(str);
     int dec = decimalToDest(nn);
     return dec;
    }
  
 public static int sourceToDecimal(String str){
      int decimal = 0;
      for(int i = 0;str.length() != 0;i++){
          int r = 0;
          char ch = str.charAt(str.length() - 1);
          str = str.substring(0,str.length() - 1);
          if(ch > 64){
              r = (int)(ch - 55);
          }
        else{
              r = (int)(ch - 48);
          }
          decimal = decimal + (r *(int)Math.pow(16,i));
      }
      return decimal;
  }

public static int decimalToDest(int n){
      int dest = 0;
      for(int i = 0;n!= 0;i++){
          int r = n%8;
          n = n/8;
          dest = dest + (r *(int)Math.pow(10,i));
      }
      return dest;
  }

 }





 import java.util.*;
public class Main{
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String n = scn.nextLine();
    int dn = anyToany(n);
    System.out.println(dn);
}   
   
 public static int anyToany( String str) {
     int dec = sourceToDecimal(str);
     return dec;
    }
  
 public static int sourceToDecimal(String str){
      int decimal = 0;
      for(int i = 0;str.length() != 0;i++){
          int r = 0;
          char ch = str.charAt(str.length() - 1);
          str = str.substring(0,str.length() - 1);
          if(ch > 64){
              r = (int)(ch - 55);
          }
        else{
              r = (int)(ch - 48);
          }
          decimal = decimal + (r *(int)Math.pow(16,i));
      }
      return decimal;
  }


 }





 import java.util.*;
  public class Main{
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int dn = anyToany(n);
        System.out.println(dn);
   }   
   
    public static int anyToany( int n) {
     int nn = sourceToDecimal(n);
     int dec = decimalToDest(nn);
     return dec;
    }
  
 public static int sourceToDecimal(int n){
      int decimal = 0;
      for(int i = 0;n!= 0;i++){
          int r = n%10;
          n = n/10;
          decimal = decimal + (r *(int)Math.pow(2,i));
      }
      return decimal;
  }

  public static int decimalToDest(int n){
      int dest = 0;
      for(int i = 0;n!= 0;i++){
          int r = n%8;
          n = n/8;
          dest = dest + (r *(int)Math.pow(10,i));
      }
      return dest;
  }
 }










 import java.util.*;
  public class Main{
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int dn = anyToany(n);
        System.out.println(dn);
   }   
   
    public static int anyToany( int n) {
     int dec = sourceToDecimal(n);
     return dec;
    }
  
 public static int sourceToDecimal(int n){
      int decimal = 0;
      for(int i = 0;n!= 0;i++){
          int r = n%10;
          n = n/10;
          decimal = decimal + (r *(int)Math.pow(2,i));
      }
      return decimal;
  }
 }









 import java.util.*;
  public class Main{
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String dn = anyToany(n);
        System.out.println(dn);
   }   
   
    public static String anyToany( int n) {
     int nn = sourceToDecimal(n);
     String dec = decimalToDest(nn);
     return dec;
    }
  
 public static int sourceToDecimal(int n){
      int decimal = 0;
      for(int i = 0;n!= 0;i++){
          int r = n%10;
          n = n/10;
          decimal = decimal + (r *(int)Math.pow(2,i));
      }
      return decimal;
  }

  public static String decimalToDest(int n){
       String sum = "";
       for(int i = 0;n !=0;i++){
           int r = n%16;
           n = n /16;
           if(r < 10){
               char temp = (char)(r + 48);
               sum = temp  +sum;
           }else{
               char temp = (char)(r + 55);
               sum = temp + sum;
           }
       }
       return sum;
  }
 }




 import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
      int d = getSum(n1, n2);
      if(d == -1){
        System.out.println("Not A Binary Number");
      }else{
        System.out.println(d);
      }
   }
  
   public static int getSum(int n1, int n2){
       int ans = 0,c = 0,i =0;
       while(n2 != 0 || n1 != 0 || c !=0){
           int r1 = n1%10;
           int r2 = n2%10;
           if(r1 > 1 || r2 > 1){
               return -1;
           }
           n1 = n1/10;
           n2 = n2/10;
           int sum = r1 + r2 +c;
           c = sum/2;						//Carry
           int r = sum%2;					//Digits of ans from last
           ans = ans +r *((int)Math.pow(10,i));
           sum = 0;
           i++;
       }
       return ans;
   }
  }




  import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(n1, n2);
    System.out.println(d);
 }

 public static int getProduct(int n1, int n2){
     int tans = 0,ans = 0;
     for(int i = 0;n1 != 0;i++){
        int d1 = n1%10;
        n1 = n1/10;
        int sum = getSingleProduct(n2,d1)*(int)Math.pow(10,i);
        ans = getSum(sum,ans);
     }
     return ans;
 }
 
  public static int getSingleProduct(int n2,int d1){
      int ans = 0,c = 0;
        for(int j = 0;n2 != 0 || c != 0;j++){
            int r1 = n2 % 10;
            n2 = n2/10;
            int r = r1 *d1 +c;
            int digit = r %2;
            c = r/2;
            ans += digit *(int)Math.pow(10,j);
        }
     return ans;
  }
 
   public static int getSum( int n1, int n2){
       int ans = 0,c = 0,i =0;
        while(n2 != 0 || n1 != 0 || c !=0){
            int r1 = n1%10;
            int r2 = n2%10;
            n1 = n1/10;
            n2 = n2/10;
            int sum = r1 + r2 +c;
            c = sum/2;
            int r = sum%2;
            ans = ans +r *((int)Math.pow(10,i));
            sum = 0;
            i++;
      }
      return ans;
   }

}


import java.util.*;

public class RomanToNumber{
    
    public static void main(String args[])
	{
		RomanToNumber ob = new RomanToNumber();
        Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		int num = romanToDecimal(str);
		System.out.println("Integer form of Roman Numeral" + " is " + num);
	}
    
	public static int value(char r)
	{
		if (r == 'I')
			return 1;
		if (r == 'V')
			return 5;
		if (r == 'X')
			return 10;
		if (r == 'L')
			return 50;
		if (r == 'C')
			return 100;
		if (r == 'D')
			return 500;
		if (r == 'M')
			return 1000;
		return -1;
	}

	public static int romanToDecimal(String str)
	{
		int res = 0;

		for (int i = 0; i < str.length(); i++)
		{
			int s1 = value(str.charAt(i));
			if(s1 == -1){return -1;}

			if (i + 1 < str.length())
			{
				int s2 = value(str.charAt(i + 1));
				if(s2 == -1){return -1;}

				// Comparing both values
				if (s1 >= s2)   // Value of current symbol is greater or equal to the next symbol
				{
					res = res + s1;
				}else{              // Value of current symbol is less than the next symbol
					res = res + s2 - s1;
					i++;
				}
			}
			else {
				res = res + s1;
			}
		}

		return res;
	}
}
import java.util.*;

public class Main{
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        convertNumber(n);
  }
    
  static String[] units = {
    "zero",
    " one",
    " two",
    " three",
    " four",
    " five",
    " six",
    " seven",
    " eight",
    " nine"
  };
  
  
  public static void convertNumber(int n){
      if(n == 0){
          System.out.println(n + "  :   " + units[0]);
          return;
      }
      int count = -1,temp = n;
      while(temp > 0){
          temp = temp / 10;
          count++;
      }
      
      while(n > 0){
          int r = n / (int)Math.pow(10,count);
          n = n % (int)Math.pow(10,count);
          count--;
          System.out.println(r + "  :   " + units[r]);
      }
  }
}







import java.util.*;

public class Main{
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(n + "    :   " + convertNumber(n));
  }
    
  static String[] units = {
    "",
    " one",
    " two",
    " three",
    " four",
    " five",
    " six",
    " seven",
    " eight",
    " nine"
  };
  
  static String[] twoDigits = {
    " ten",
    " eleven",
    " twelve",
    " thirteen",
    " fourteen",
    " fifteen",
    " sixteen",
    " seventeen",
    " eighteen",
    " nineteen"
  };
  
  static String[] tenMultiples = {
    "",
    "",
    " twenty",
    " thirty",
    " forty",
    " fifty",
    " sixty",
    " seventy",
    " eighty",
    " ninety"
  };
  
  static String[] placeValues = {
    " ",
    " thousand",
    " million",
    " billion",
    " trillion"
  };
        
  public static String convertNumber(long number) {    
    String word = "";    
    int index = 0;
    do {
      // take 3 digits in each iteration
      int num = (int)(number % 1000);
      if (num != 0){
        String str = ConversionForUptoThreeDigits(num);
        word = str + placeValues[index] + word;
      }
      index++;
      // next 3 digits
      number = number/1000;
    } while (number > 0);
    return word;
  }
    
  public static String ConversionForUptoThreeDigits(int number) {
    String word = "";    
    int num = number % 100;
    if(num < 10){
      word = word + units[num];
    }
    else if(num < 20){
      word = word + twoDigits[num%10];
    }else{
      word = tenMultiples[num/10] + units[num%10];
    }
    
    word = (number/100 > 0)? units[number/100] + " hundred" + word : word;
    return word;
  }
}


import java.util.*;

public class Main{
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        sumProduct(n);
  }
  
  
  public static void sumProduct(int n){
      int count = -1,temp = n,sum = 0,pro = 1;
      while(temp > 0){
          temp = temp / 10;
          count++;
      }
      
      while(n > 0){
          int r = n / (int)Math.pow(10,count);
          n = n % (int)Math.pow(10,count);
          count--;
          sum += r;
          pro *= r;
      }
          System.out.println("Sum  :   " + sum);
          System.out.println("Product  :   " + pro);
  }
}









import java.util.*;

class GFG {
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
	    printRoman(number);
	}
	
	public static String sub_digit(char num1, char num2) {
		String str = num1 + "" + num2;
		return str;
	}

// To add symbol 'ch' n times
	public static String digit(char ch, int n) {
	    String str = "";
		for (int j = 0; j < n; j++) {
			str += ch  + "";
		}
		return str;
	}

// Function to convert decimal to Roman Numerals
	public static void printRoman(int number) {
		String str = "" ;

		if (number <= 0) {
			System.out.printf("Invalid number");
			return;
		}

		// TO convert decimal number to roman numerals
		while (number != 0) {
			// If base value of number is greater than 1000
			if (number >= 1000) {
				// Add 'M' number/1000 times after index i
				str += digit('M', number / 1000);
				number = number % 1000;
			} // If base value of number is greater than or
			// equal to 500
			else if (number >= 500) {
				// To add base symbol to the character array
				if (number < 900) {
					// Add 'D' number/1000 times after index i
					str += digit('D', number/500);
					number = number % 500;
				}
				else {
					// Add C and M after index i/.
					str += sub_digit('C', 'M');
					number = number % 100;
				}
			} // If base value of number is greater than or equal to 100
			else if (number >= 100) {
				// To add base symbol to the character array
				if (number < 400) {
					str += digit('C', number / 100);
					number = number % 100;
				}
				else {
					str += sub_digit('C', 'D');
					number = number % 100;
				}
			} // If base value of number is greater than or equal to 50
			else if (number >= 50) {
				// To add base symbol to the character array
				if (number < 90) {
					str += digit('L', number / 50);
					number = number % 50;
				}
				else {
					str += sub_digit('X', 'C');
					number = number % 10;
				}
			} // If base value of number is greater than or equal to 10
			else if (number >= 10) {
				// To add base symbol to the character array
				if (number < 40) {
					str += digit('X', number / 10);
					number = number % 10;
				}
				else {
					str += sub_digit('X', 'L');
					number = number % 10;
				}
			} // If base value of number is greater than or equal to 5
			else if (number >= 5) {
				if (number < 9) {
					str += digit('V', number / 5);
					number = number % 5;
				}
				else {
					str += sub_digit('I', 'X');
					number = 0;
				}
			} // If base value of number is greater than or equal to 1
			else if (number >= 1) {
				if (number < 4) {
					str += digit('I', number);
					number = 0;
				}
				else {
					str += sub_digit('I', 'V');
					number = 0;
				}
			}
		}

		// Printing equivalent Roman Numeral
		System.out.printf("Roman numeral is:    " + str);
	}
}











import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String binary = scn.nextLine();
    System.out.println(binaryToDecimal(binary));
}

  public static double binaryToDecimal(String binary){
        int decimal = binary.indexOf('.');
        if(decimal == -1){
            decimal = binary.length();
        }
        double ip = intPart(binary.substring(0,decimal));
        double dp = decPart(binary.substring(decimal));
        return ip + dp;
  }
   
   public static double intPart(String integer){
       double sum = 0;
       for(int i = integer.length() -1,j = 0; i >= 0 ;i--,j++){
           sum += (integer.charAt(i) - '0') * Math.pow(2,j);
       }
       return sum;
   }
   
   public static double decPart(String fraction){
       double sum = 0;
       for(int i = 1; i < fraction.length(); i++){
            sum +=  (fraction.charAt(i) - '0') / Math.pow(2,i);  
       }
       return sum;
   }
    
}










import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    double binary = scn.nextDouble();
    System.out.println(DecimalToBinary(binary));
}

  public static double DecimalToBinary(double binary){
        int decPlace = 10;       // Upto 9 decimal place
        double n = binary * Math.pow(2,decPlace);
        int num = (int)n;
        String str = "";
        double intSum = 0;
        int i = 0;
        while(num  > 0){
            int r = num % 2;
            num = num / 2;
            if(str.length() < decPlace){    //decimal part
                str = r + str;
            }else{                          //integer part
                intSum += r * Math.pow(10,i);   
                i++;
            }
        }
        return intSum + Double.parseDouble("0." + str);
  }
}
