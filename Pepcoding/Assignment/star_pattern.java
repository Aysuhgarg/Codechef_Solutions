import java.util.*;
public class star_pattern {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();

        for(int row=0;row<n;row++)
        {
            for(int space=n-row;space>=0;space--)
            {
                System.out.print(" ");
            }
            for(int col=0;col<(2*row)+1;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
