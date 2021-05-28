import java.util.*;
public class circle {
    public static class pair{
        double a,b;
        pair( double a, double b)
        {
            this.a=a;
            this.b=b;
        }
    }
    public static pair area_circum(int r)
    {
        double area=3.14 * (r*r);
        double cir=4 * 3.14 * r;
        pair ob=new pair(area,cir);

        return ob;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int r;
        System.out.println("Enter the radius of circle");
        r=sc.nextInt();
        pair ans=area_circum(r);
        System.out.println("area is = "+ans.a);
        System.out.println("circumference is = "+ans.b);

    }
}







import java.util.*;

class MergeTwoSorted
{
 public static void mergeArrays(int[] arr1, int[] arr2, int n1,
 int n2, int[] arr3)
 {
 int i = 0, j = 0, k = 0;
 
 while (i<n1 && j <n2)
 {
 if (arr1[i] < arr2[j])
 arr3[k++] = arr1[i++];
 else
 arr3[k++] = arr2[j++];
 }
 
 while (i < n1)
 arr3[k++] = arr1[i++];
 
 while (j < n2)
 arr3[k++] = arr2[j++];
 }
 
 public static void main (String[] args)
 {
 Scanner scn = new Scanner(System.in);
 int n1 = scn.nextInt();
 int[] arr1 = new int[n1];
 for(int i = 0;i < n1;i++){
 arr1[i] = scn.nextInt();
 }
 
 int n2 = scn.nextInt();
		int[] arr2 = new int[n2];
		for(int i = 0;i < n2;i++){
		    arr2[i] = scn.nextInt();
		}
	
		int[] arr3 = new int[n1+n2];
		
		mergeArrays(arr1, arr2, n1, n2, arr3);
	
		System.out.println("Array after merging");
		for (int i=0; i < n1+n2; i++)
			System.out.print(arr3[i] + " ");
	}
}
