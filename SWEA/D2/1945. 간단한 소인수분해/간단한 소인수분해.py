t=int(input())
for tc in range(1,t+1):
    n=int(input())
    ans=[0]*12
    k=2
    while n>=k:
        if n%k==0:
            ans[k]+=1
            n=n//k
        else:
            k+=1
    print('#'+str(tc),ans[2],ans[3],ans[5],ans[7],ans[11])