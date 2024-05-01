import sys
input=sys.stdin.readline
N,M,B=map(int,input().split())
arr=[list(map(int,input().split())) for _ in range(N)]
ans=int(1e9) #최소시간 갱신할 변수
idx=0 #층수 저장할 변수
for h in range(257): #최대높이는 256이기때문에 0~256 완전탐색
    use,take=0,0 #사용할 블럭,회수할 블럭
    for x in range(N):
        for y in range(M):
            if arr[x][y] > h: #현재높이보다 높으면
                take+=arr[x][y]-h #회수할 블럭 저장
            else: #현재 높이보다 낮으면
                use+=h-arr[x][y] #사용할 블럭 저장
    #회수할 블럭+보유한블럭이 사용할 블럭보다 많으면
    #즉, 블럭들을 사용해 평탄화 가능하면
    if take+B>=use:
        tmp=take*2+use #걸린 시간 tmp 임시저장
        if tmp<=ans: #모든 높이 탐색하며 최소시간과 층수를 갱신해줘야 함
            ans=tmp
            idx=h 
print(ans,idx)   