dx=[-1,-1,-1,1,1,1,0,0]
dy=[-1,0,1,-1,0,1,-1,1]
t=int(input())
for tc in range(1,t+1):
    n,m=map(int,input().split())
    arr=[[0]*(n+1) for _ in range(n+1)]
    mid=n//2
    arr[mid][mid],arr[mid+1][mid+1]=2,2
    arr[mid+1][mid],arr[mid][mid+1]=1,1

    for _ in range(m):
        x,y,s=map(int,input().split())
        arr[x][y]=s
        for i in range(8):
            r=[]
            for mul in range(1,n):
                nx,ny=x+dx[i]*mul,y+dy[i]*mul
                if 0<nx<=n and 0<ny<=n:
                    if arr[nx][ny]==0:
                        break
                    elif arr[nx][ny]==s:
                        while r:
                            tx,ty=r.pop()
                            arr[tx][ty]=s
                        break
                    else:
                        r.append((nx,ny))
                else:
                    break
    ans=[0,0]
    for a in arr:
        ans[0]+=a.count(1)
        ans[1]+=a.count(2)
    print('#'+str(tc),*ans)