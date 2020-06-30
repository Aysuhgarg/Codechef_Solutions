//problem Statement ---------------------->https://www.codechef.com/APRIL20B/problems/ANSLEAK

------------------------------------Solution-----------------------------------
#include <bits/stdc++.h>
#include <cstdlib> 
#include <ctime> 
#include <iostream>
using namespace std;

int main() {
    
	int t,n,m,k,i,j,x,l,r;
	cin>>t;
	while(t-->0)
	{
	    scanf("%d%d%d",&n,&m,&k);
	    int a[n][k];
	    for(i=0;i<n;i++)
	    {
	        for(j=0;j<k;j++)
	        {
	            scanf("%d",&a[i][j]);
	        }
	    }
	    srand((unsigned) time(0));
	    for(i=0;i<n;i++)
	    {
	        r=(rand()%m)+1;
	        printf("%d ",r);
	    }
	   printf("\n");
	}
	return 0;
}