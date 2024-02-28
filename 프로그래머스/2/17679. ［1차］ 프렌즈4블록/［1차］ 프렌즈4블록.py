def solution(m, n, board):
    answer = 0
    board=[list(b) for b in board]
    tmp=set()
    while True:
        for i in range(m-1):
            for j in range(n-1):
                t=board[i][j]
                if t==[]:
                    continue
                elif t==board[i+1][j] and t==board[i][j+1] and t==board[i+1][j+1]:
                    tmp.add((i,j))
                    tmp.add((i+1,j))
                    tmp.add((i,j+1))
                    tmp.add((i+1,j+1))
        if tmp:
            answer+=len(tmp)
            for i,j in tmp:
                board[i][j]=[]
            tmp=set()
        else:
            break
        while True:
            move=0
            for i in range(m-1):
                for j in range(n):
                    if board[i][j] and board[i+1][j]==[]:
                        board[i][j],board[i+1][j]=board[i+1][j],board[i][j]
                        move=1
            if move==0:
                break
    return answer