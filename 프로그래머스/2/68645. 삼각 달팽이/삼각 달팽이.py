def solution(n):
    answer = [[0]*i for i in range(1,n+1)]
    x,y=-1,0
    cnt=1
    for i in range(n):
        for j in range(i,n):
            if i%3==0:
                x+=1
            elif i%3==1:
                y+=1
            else:
                x-=1
                y-=1
            answer[x][y]=cnt
            cnt+=1
    return sum(answer,[])