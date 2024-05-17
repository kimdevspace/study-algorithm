t=int(input())
for tc in range(1,t+1):
    a,b=map(int,input().split())
    tmp=[]
    ans=0
    for i in range(a,b+1):
        if (i**0.5)%1==0:
            tmp.append(i)
    for t in tmp:
        if str(t)==str(t)[::-1] and str(int(t**0.5))==str(int(t**0.5))[::-1]:
            ans+=1
    print('#'+str(tc),ans)