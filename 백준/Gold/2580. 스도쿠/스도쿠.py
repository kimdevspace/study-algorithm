board=[list(map(int,input().split())) for _ in range(9)]
zero=[]
for i in range(9):
    for j in range(9):
        if board[i][j]==0:
            zero.append((i,j))
def check(row,col,x):
    #행체크
    for i in range(9):
        if board[row][i]==x:
            return False
    #열체크
    for i in range(9):
        if board[i][col]==x:
            return False
    #3x3박스체크
    sub_row,sub_col=row//3*3,col//3*3
    for i in range(3):
        for j in range(3):
            if board[sub_row+i][sub_col+j]==x:
                return False
    return True
def dfs(idx):
    if idx==len(zero):
        for i in range(9):
            print(*board[i])
        exit(0)
    for i in range(1,10):
        row,col=zero[idx]
        if check(row,col,i):
            board[row][col]=i
            dfs(idx+1)
            board[row][col]=0
dfs(0)