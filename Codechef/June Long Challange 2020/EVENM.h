Problem Statement------------>https://www.codechef.com/JUNE20B/problems/EVENM

------------------------->Solution<---------------

#include <iostream>
using namespace std;

int main() {
	// your code goes here
	
	int t;
		//t=sc.nextInt();
		scanf("%d",&t);
		while(t-->0)
		{
		    int n,k=1;
		  //  n=sc.nextInt();
		    	scanf("%d",&n);
		    int a[n+1][n+1];//=new int[n+1][n+1];
		    for(int i=1;i<=n;i++)
		    {
		        if(i%2==0)
		        {
		            for(int j=n;j>=1;j--)
		            {
		                a[i][j]=k++;
		            }
		        }
		        else
		        {
		            for(int j=1;j<=n;j++)
		            {
		                a[i][j]=k++;
		            }
		        }
		    }
		    
		    for(int i=1;i<=n;i++)
		    {
		        for(int j=1;j<=n;j++)
		        {
		            printf("%d ",a[i][j]);
		        }
		        printf("\n");
		    }
		}
	
	
	return 0;
}
