tank={'^':'U', 'v':'D', '<':'L', '>':'R'}

t=int(input())
for tc in range(1,t+1):
    h,m=map(int,input().split())
    graph=[list(input()) for _ in range(h)]
    n=int(input())
    com=list(input())

    x,y=0,0

    for i in range(h):
        for j in range(m):
            if graph[i][j] in ['^','v','<','>']:
                x,y=i,j

    for c in com:
        if c=='U':
            graph[x][y]='^'
            if 0<=x-1<h and graph[x-1][y]=='.':
                graph[x-1][y]='^'
                graph[x][y]='.'
                x,y=x-1,y
        elif c=='D':
            graph[x][y]='v'
            if 0<=x+1<h and graph[x+1][y]=='.':
                graph[x+1][y]='v'
                graph[x][y] = '.'
                x,y=x+1,y
        elif c=='L':
            graph[x][y]='<'
            if 0<=y-1<m and graph[x][y-1]=='.':
                graph[x][y-1]='<'
                graph[x][y]='.'
                x,y=x,y-1
        elif c=='R':
            graph[x][y]='>'
            if 0<=y+1<m and graph[x][y+1]=='.':
                graph[x][y+1]='>'
                graph[x][y]='.'
                x,y=x,y+1
        else:
            if tank[graph[x][y]]=='U':
                for i in range(x,-1,-1):
                    if graph[i][y]=='#':
                        break
                    if graph[i][y]=='*':
                        graph[i][y]='.'
                        break
            elif tank[graph[x][y]]=='D':
                for i in range(x,h):
                    if graph[i][y]=='#':
                        break
                    if graph[i][y]=='*':
                        graph[i][y]='.'
                        break
            elif tank[graph[x][y]]=='R':
                for i in range(y,m):
                    if graph[x][i]=='#':
                        break
                    if graph[x][i]=='*':
                        graph[x][i]='.'
                        break
            elif tank[graph[x][y]]=='L':
                for i in range(y,-1,-1):
                    if graph[x][i] == '#':
                        break
                    if graph[x][i]=='*':
                        graph[x][i]='.'
                        break
    print('#'+str(tc),end=' ')
    for i in range(h):
        for j in range(m):
            print(graph[i][j],end='')
        print()