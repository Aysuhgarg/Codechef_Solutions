import java.util.*;
public class swap_without_using_temp { //Question 36
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a,b;
      a=sc.nextInt();
      b=sc.nextInt();
      System.out.println("Before swaping");
      System.out.println("Value of a is = "+ a );
      System.out.println("Value of b is = "+ b );
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println("After swaping");
      System.out.println("Value of a is = "+ a );
      System.out.println("Value of b is = "+ b );
    }
}





import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }
    int largest = arr[0];
    
    for(int i = 1;i < n;i++){
        if(arr[i] > largest){
            largest = arr[i];
        }
    }
    
    System.out.println(largest);
  }

}

import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int n = Integer.parseInt(str);
    int digit = str.length() - 1;
    while(n > 0){
        System.out.println(n/(int)Math.pow(10,digit));
        n %= Math.pow(10,digit);
        digit--;
    }
  }
}
