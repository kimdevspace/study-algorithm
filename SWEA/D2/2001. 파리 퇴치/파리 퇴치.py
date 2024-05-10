t=int(input())
for tc in range(1,t+1):
    n,m=map(int,input().split())
    arr=[list(map(int,input().split())) for _ in range(n)]
    ans=0
    print('#'+str(tc),end=' ')
    for i in range((n+1)-m):
        for j in range((n+1)-m):
            tmp=0
            for x in range(i,i+m):
                for y in range(j,j+m):
                    tmp+=arr[x][y]
            ans=max(tmp,ans)
    print(ans)