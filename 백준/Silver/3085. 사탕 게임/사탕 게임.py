#상하좌우 할 필요 없음 중복되기 떄문. 따라서 오른쪽, 밑쪽만 바꾸면 됨
import sys
input=sys.stdin.readline
n=int(input())
arr=[list(input()) for _ in range(n)]

max_cnt=0
def check():
    global max_cnt
    for i in range(n):
        cnt=1 #행을 검사
        for j in range(1,n):
            if arr[i][j]==arr[i][j-1]:
                cnt+=1
                max_cnt=max(max_cnt,cnt)
            else:
                cnt=1
        cnt=1 #열을 검사
        for j in range(1,n):
            if arr[j][i]==arr[j-1][i]:
                cnt+=1
                max_cnt=max(max_cnt,cnt)
            else:
                cnt=1
                
for i in range(n):
    for j in range(n):
        if j+1<n: #오른쪽과 바꿈
            arr[i][j],arr[i][j+1]=arr[i][j+1],arr[i][j]
            check()
            arr[i][j],arr[i][j+1]=arr[i][j+1],arr[i][j]
        if i+1<n: #아래쪽과 바꿈
            arr[i][j],arr[i+1][j]=arr[i+1][j],arr[i][j]
            check()
            arr[i][j],arr[i+1][j]=arr[i+1][j],arr[i][j]
print(max_cnt)