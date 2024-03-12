n=int(input())
condo=[list(input()) for _ in range(n)]
garo,sero=0,0
for i in range(n):
    cnt1,cnt2=0,0
    for j in range(n):
        #가로
        if condo[i][j]=='.':
            cnt1+=1
        else:
            cnt1=0
        if cnt1==2:
            garo+=1
        #세로
        if condo[j][i]=='.':
            cnt2+=1
        else:
            cnt2=0
        if cnt2==2:
            sero+=1
print(garo,sero)