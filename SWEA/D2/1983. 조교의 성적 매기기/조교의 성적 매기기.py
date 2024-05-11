t=int(input())
for tc in range(1,t+1):
    n,k=map(int,input().split())
    x=n//10
    arr=[]
    ans=[]
    score=['A+','A0','A-','B+','B0','B-','C+','C0','C-','D0']*x
    for _ in range(n):
        ft,st,hw=map(int,input().split())
        total=(ft*0.35)+(st*0.45)+(hw*0.2)
        arr.append(total)
    rank=sorted(arr,reverse=True)
    for i in range(n):
        for j in range(x):
            ans.append(score[i])
    print('#'+str(tc),ans[rank.index(arr[k-1])])