def check():
    for si in range(n):
        for sj in range(n):
            for di,dj in [(0,1),(1,0),(1,1),(-1,1)]:
                for mul in range(5):
                    ni,nj=si+di*mul,sj+dj*mul
                    if 0<=ni<n and 0<=nj<n and arr[ni][nj]=='o':
                        pass
                    else:
                        break
                else:
                    return 'YES'
    return 'NO'

t=int(input())
for tc in range(1,t+1):
    n=int(input())
    arr=[list(input()) for _ in range(n)]
    print('#'+str(tc),check())