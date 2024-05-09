def dist(x,y):
    if x==1: #1이면 북. 북이면 왼쪽경계로부터 떨어진 y
        return y
    elif x==2: #2이면 남. 남이면 왼쪽경계로부터 떨어진 y
        return w+h+w-y
    elif x==3: #3이면 서, 서이면 위쪽 경계로부터 떨어진 y
        return w+h+w+h-y
    else: #4 동, 위쪽으로부터 떨어진 거리.
        return w+y
w,h=map(int,input().split())
n=int(input())
d=[] #(0,0)부터 상점과 동근이의 절대거리를 담을 배열
for _ in range(n+1):
    x,y=map(int,input().split())
    d.append(dist(x,y))
total=0
for i in range(n):
    right=abs(d[-1]-d[i]) #동근과 상점의 시계방향 거리의 절댓값
    left=2*(w+h)-right #동근과 상점의 반시계방향 거리
    total+=min(right,left) #최솟값 더해주기
print(total)