def solution(park, routes):
    x,y=0,0
    w,h=len(park[0]),len(park)
    dic={'N':(-1,0),'S':(1,0),'E':(0,1),'W':(0,-1)}
    for i in range(h):
        for j in range(w):
            if park[i][j]=='S':
                x,y=i,j
                break
    for route in routes:
        d,n=route.split(' ')
        dx,dy=x,y
        for _ in range(int(n)):
            nx=x+dic[d][0]
            ny=y+dic[d][1]
            if 0<=nx<=h-1 and 0<=ny<=w-1 and park[nx][ny]!='X':
                x,y=nx,ny
            else:
                x,y=dx,dy
                break
    return (x,y)