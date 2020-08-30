//        https://www.codechef.com/LTIME87B/problems/ARRGAME

# cook your dish here
import math
t=int(input())
while(t>0):
    n=int(input())
    a=[int(x) for x in input().split()]
    cou=0
    m=0
    y=[]
    for it in a:
        if(it==0):
            cou=cou+1
        else:
            if(cou>m):
                m=cou
            if(cou!=0):
                y.append(cou)
            cou=0
    s=0
    c=0
    if(len(y)>1):
        for it in y:
            if(it==m):
                c=c+1
            if(it!=m and it>s):
                s=it
    if(c>1):
        s=m
    if(m%2==0):
        print("No")
    else:
        pl1=int(math.ceil(m/2))
        pl2=s
        if(pl1>pl2):
            print("Yes")
        else:
            print("No")
    t=t-1