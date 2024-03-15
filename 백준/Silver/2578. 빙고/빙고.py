def check(lst):
    bingo=0
    for i in range(5):
        if sum(lst[i])==0:
            bingo+=1
    for i in range(5):
        cnt_tmp=0
        for j in range(5):
            if lst[j][i]==0:
                cnt_tmp+=1
        if cnt_tmp==5:
            bingo+=1
    tmp1=[]#왼대각
    tmp2=[]#오른대각
    for i in range(5):
        tmp1.append(lst[i][i])
        tmp2.append(lst[i][4-i])
    if sum(tmp1)==0:
        bingo+=1
    if sum(tmp2)==0:
        bingo+=1
    return bingo
board=[list(map(int,input().split())) for _ in range(5)]
call=[list(map(int,input().split())) for _ in range(5)]
cnt=0
for i in range(5):
    for j in range(5):
        for k in range(5):
            for h in range(5):
                if call[i][j]==board[k][h]:
                    board[k][h]=0
                    cnt+=1
                if cnt>=12:
                    if check(board)>=3:
                        print(cnt)
                        exit()