//Problem Statement---------------->https://www.codechef.com/APRIL20B/problems/SQRDSUB

------------------------------Solution-------------------------------------
#include <bits/stdc++.h>
using namespace std;
//#define SIZE 10000
long long int ar[10000000],L[10000000];
long long int N[10000000];

 long long int calc(int n){
    long long int ans = 0;
    for(int i = 0; i < n; i++){
        if(L[i] == 0) {
            if(N[i] == -1) return ans;
            else if(L[N[i]] == 1){
                if(N[N[i]] == -1){       //all after that 1 is 0 
                    ans += n - N[i];
                }
                else {                  //exists 1 or 2 after the 1
                    ans += N[N[i]] - N[i];
                }
            }
        }
        else if(L[i] == 1) {
            if(N[i] == -1) return ans + n - i;
            else {
                ans += N[i] - i;
            }
        }
    }
    return ans;
}



int main(void) {
	int t;
	    
		scanf("%d",&t);
		while(t-->0)
		{
		    long long int  n,i,j,k;
		    long long int cnt=0;
		    //cin>>n;
		    //scan("%d",&n);
		    scanf("%lld",&n);
		    //long ar[n];
		   // SIZE=n;
		    for(i=0;i<n;i++)
		      scanf("%lld",&ar[i]);
		    
		    for( i = 0; i < n; i++){
              if(ar[i] % 4 == 0) L[i] = 2;
              else if(ar[i] % 2 == 0) L[i] = 1;
              else L[i] = 0;
              }
             long long int next = -1;
             for(int i = n - 1; i >= 0; i--){
              N[i] = next;
              if(L[i] != 0) next = i;  
              }
             
		    
		    long long int total = (n * (n + 1))/2;
		    printf("%lld\n",total - calc(n));
		}
	return 0;
}


