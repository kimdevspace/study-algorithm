N=int(input())
stars=[[' ' for _ in range(4*N-3)] for _ in range(4*N-3)]
def draw(n,a,b):
    if n==1:
        stars[a][b]='*'
        return
    length=4*n-3
    for i in range(length):
        stars[a][b+i]='*'
        stars[a+i][b]='*'
        stars[a+length-1][b+i]='*'
        stars[a+i][b+length-1]='*'
    draw(n-1,a+2,b+2)
draw(N,0,0)
for s in stars:
    print(*s,sep='')