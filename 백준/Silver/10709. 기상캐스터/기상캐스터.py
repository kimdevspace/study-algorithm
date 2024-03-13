H,W=map(int,input().split())
weather=[input() for _ in range(H)]
move=[[0]*W for _ in range(H)]
for i in range(H):
    cnt=1
    cloud=False
    for j in range(W):
        if not cloud and weather[i][j]=='.':
            move[i][j]=-1
        elif weather[i][j]=='c':
            cloud=True
            move[i][j]=0
            cnt=1
        elif cloud and weather[i][j]=='.':
            move[i][j]=cnt
            cnt+=1
for i in range(H):
    for j in range(W):
        print(move[i][j],end=' ')
    print()