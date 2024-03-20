##DFS
n,m=map(int,input().split())
arr=[list(input()) for _ in range(n)]
visited=[[0]*m for _ in range(n)] #방문확인
def sero(x,y): #세로
    if x>=n or y>=m:
        return False
    if visited[x][y]==0 and arr[x][y]=='|':
        visited[x][y]=1
        sero(x+1,y)
        return True  #두개 이상의 세로 막대가 인접해있으면 하나로 계산.
    return False
def garo(x,y):
    if x>=n or y>=m:
        return False
    if visited[x][y]==0 and arr[x][y]=='-':
        visited[x][y]=1
        garo(x,y+1)
        return True
    return False
res=0
for i in range(n):
    for j in range(m):
        if sero(i,j) or garo(i,j):
            res+=1
print(res)