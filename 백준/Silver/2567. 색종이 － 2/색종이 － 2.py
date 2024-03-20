n=int(input())
board=[[0]*101 for _ in range(101)]
for _ in range(n):
    a,b=map(int,input().split())
    for i in range(a,a+10):
        for j in range(b,b+10):
            board[i][j]=1
cnt=0
for i in range(101):
    for j in range(101):
        if board[i][j]==1:
            for di,dj in ((0,1),(0,-1),(1,0),(-1,0)): #4방향탐색
                ni=i+di
                nj=j+dj
                if board[ni][nj]==0:
                    cnt+=1
print(cnt)