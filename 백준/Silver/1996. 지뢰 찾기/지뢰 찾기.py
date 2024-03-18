n=int(input())
arr=[list(input()) for _ in range(n)]
board=[[0 for _ in range(n)] for _ in range(n)]
move=[(-1,-1),(-1,0),(-1,1),(0,1),
      (1,1),(1,0),(1,-1),(0,-1)]
for i in range(n):
    for j in range(n):
        if arr[i][j]!='.':
            tmp=arr[i][j]
            board[i][j]='*'
            for m in move:
                if 0<=i+m[0]<n and 0<=j+m[1]<n and arr[i+m[0]][j+m[1]]=='.':
                    board[i+m[0]][j+m[1]]+=int(tmp)
for i in range(n):
    for j in range(n):
        if board[i][j]!='*':
            if board[i][j]>=10:
                board[i][j]='M'
            else:
                board[i][j]=str(board[i][j])
for b in board:
    print(''.join(map(str,b)))