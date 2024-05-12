dx=[0,1,0,-1]
dy=[1,0,-1,0]
t=int(input())
for tc in range(1,t+1):
    n=int(input())
    snail=[[0]*n for _ in range(n)]
    num=1
    dist=0
    x,y=0,-1
    while num<=n*n:
        nx,ny=x+dx[dist],y+dy[dist]
        if 0<=nx<n and 0<=ny<n and snail[nx][ny]==0:
            snail[nx][ny]=num
            num+=1
            x,y=nx,ny
        else:
            dist=(dist+1)%4
    print(f'#{tc}')
    for s in snail:
        print(*s)