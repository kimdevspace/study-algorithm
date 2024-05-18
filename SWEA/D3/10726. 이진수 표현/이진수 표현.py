t=int(input())
for tc in range(1,t+1):
    n,m=map(int,input().split())
    print('#'+str(tc),end=' ')
    if bin(m)[2:].zfill(32)[32-n:]=='1'*n:
        print('ON')
    else:
        print('OFF')