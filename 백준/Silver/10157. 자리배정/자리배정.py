C,R=map(int,input().split())
k=int(input())
if k>C*R:
    print(0)
else:
    board=[[0]*C for _ in range(R)] #방문확인할 배열
    board[0][0]=1
    move=[(1,0),(0,1),(-1,0),(0,-1)]#뒤집어서 사용 (상하반전)
    cur_direction=0 #현재 진행방향
    x,y=0,0
    for i in range(2,k+1):
        while True:
            a,b=move[cur_direction]
            dx=x+a
            dy=y+b
            if 0<=dx<R and 0<=dy<C and board[dx][dy]==0: #진행방향 조건
                board[dx][dy]=i
                x=dx
                y=dy
                break
            else: #조건에 어긋날 시 다음 진행방향으로 변경
                cur_direction=(cur_direction+1)%4
    print(y+1,x+1)