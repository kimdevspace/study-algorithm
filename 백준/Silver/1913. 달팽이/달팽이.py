n=int(input())
k=int(input())
snail=[[0]*n for _ in range(n)]
ans=[0,0]
def gogo(i,j,length,num):
    if i==n//2 and j==n//2:
        snail[i][j]=num
        return
    row,col=i,j
    while i<length:
        snail[i][j]=num
        i+=1
        num-=1
    i-=1
    j+=1
    while j<length:
        snail[i][j]=num
        j+=1
        num-=1
    i-=1
    j-=1
    while i>row-1:
        snail[i][j]=num
        i-=1
        num-=1
    i+=1
    j-=1
    while j>col:
        snail[i][j]=num
        j-=1
        num-=1
    gogo(row+1,col+1,length-1,num)

gogo(0,0,n,n*n)

for i in range(n):
    for j in range(n):
        if snail[i][j]==k:
            ans[0]=i+1
            ans[1]=j+1
        print(snail[i][j],end=' ')
    print()
print(*ans)