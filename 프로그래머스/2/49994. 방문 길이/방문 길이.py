def solution(dirs):
    answer = 0
    distance={'U':(0,1),'D':(0,-1),'R':(1,0),'L':(-1,0)}
    visited=set() #겹치는길 제외하기 위해.
    x,y=0,0
    for d in dirs:
        nx,ny=x+distance[d][0],y+distance[d][1]
        if -5<=nx<=5 and -5<=ny<=5:
            visited.add((x,y,nx,ny)) #간선 저장
            visited.add((nx,ny,x,y)) 
            x,y=nx,ny
    return len(visited)//2