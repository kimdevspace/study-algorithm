arr=[[0]*301 for _ in range(301)]
for i in range(1,301):
    x=i
    for j in range(1,301):
        if j==1:
            arr[i][j]=arr[i-1][j]+i
        else:
            arr[i][j]=arr[i][j-1]+x
            x+=1
t=int(input())

for tc in range(1,t+1):
    p,q=map(int,input().split())

    x1,x2,y1,y2=0,0,0,0

    for i in range(1,301):
        for j in range(1,301):
            if arr[i][j]==p:
                x1,y1=i,j
            if arr[i][j]==q:
                x2,y2=i,j
            if x1!=0 and x2!=0 and y1!=0 and y2!=0:
                break
    sx,sy=x1+x2,y1+y2
    print('#'+str(tc),arr[sx][sy])