def solution(dirs):
    answer = 0
    distance={'U':(0,1),'D':(0,-1),'L':(-1,0),'R':(1,0)}
    visited=set()
    x=y=0
    for d in dirs:
        nx,ny=x+distance[d][0],y+distance[d][1]
        if -5<=nx<=5 and -5<=ny<=5:
            visited.add((nx,ny,x,y))
            visited.add((x,y,nx,ny))
            x,y=nx,ny
    return len(visited)//2