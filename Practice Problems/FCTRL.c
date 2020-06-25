// problem Starement ----------->https://www.codechef.com/problems/FCTRL


#include<stdio.h>
int main()
{
  long int t,n=0,count;
  scanf("%ld",&t);
  if(t<=0)
   return 0;
  while(t--)
  {
    scanf("%ld",&n);
    count=0;
    while(n/5!=0)
    {
       count+=(n/5);
       n/=5;
    }
    printf("%ld\n",count);
  }
  return 0;
}