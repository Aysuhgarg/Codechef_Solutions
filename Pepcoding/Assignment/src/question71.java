import java.util.*;
public class question71 {

    public static void odd(int []a)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2!=0)
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
 
    public static void sum_avg(int []a)
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
           sum=sum+a[i];
        }
        System.out.println("Sum is = "+sum);
        System.out.println("average is = "+sum/a.length);
    }

    public static void even(int []a)             
    {
        System.out.println("Even number are ");
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void min_max(int []a)
    {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
          if(min>a[i])
          {
              min=a[i];
          }
          if(max<a[i])
          {
              max=a[i];
          }
        }
        System.out.println("MINIMUM is = "+min);
        System.out.println("MAXIMUM is = "+max);
    }

   public static void remove(int[] a) 
    {
        HashMap<Integer, 
                Boolean> mp = new HashMap<>();
        System.out.println("Duplicates are removed");
        for (int i = 0; i < a.length; ++i)
        {
            if (mp.get(a[i]) == null)
                System.out.print(a[i] + " ");

            mp.put(a[i], true);
        }
    }
 
    public static void reverse(int []a)
    {
        System.out.println("Array is reversed");
        for(int i=(a.length-1);i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n;
        System.out.println("Enter the array length");
        n=sc.nextInt();
        int a[]=new int [n];
        System.out.println("Enter the array element");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Press 1 to print even valued element");
        System.out.println("Press 2 to print odd valued element");
        System.out.println("Press 3 to print sum and average ");
        System.out.println("Press 4 to print minimum ans maximum");
        System.out.println("Press 5 to remove duplicate");
        System.out.println("Press 6 to print array in reverse order");

        int ch=sc.nextInt();
        switch(ch)
        {
          case 1:
          {
              even(a);
              break;
          }
          case 2:
          {
               odd(a);break;
          }
          case 3:
          {
              sum_avg(a);
              break;
          }
          case 4:
          {
               min_max(a);break;
          }
          case 5:
          {
              remove(a);
              break;
          }
          case 6:
          {
               reverse(a);break;
          }
          default:{
              System.out.println("Wrong choice");
              break;
          }
        }
    }
}
