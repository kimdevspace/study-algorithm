from collections import deque
T=int(input())

dx=[-2,-2,-1,-1,1,1,2,2]
dy=[-1,1,-2,2,-2,2,-1,1]

def bfs(x,y):
    q=deque([(x,y)])
    board[x][y]=1
    while q:
        x,y=q.popleft()
        for i in range(8):
            nx,ny=x+dx[i],y+dy[i]
            if 0<=nx<l and 0<=ny<l and board[nx][ny]==0:
                q.append((nx,ny))
                board[nx][ny]=board[x][y]+1

for _ in range(T):
    l=int(input()) #체스판 한변의 길이
    board=[[0]*l for _ in range(l)] #체스판
    x,y=map(int,input().split()) #나이트위치
    a,b=map(int,input().split()) #나이트가 이동하려는 위치
    bfs(x,y)
    print(board[a][b]-1)