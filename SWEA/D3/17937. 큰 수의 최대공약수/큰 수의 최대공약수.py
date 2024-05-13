t=int(input())
for tc in range(1,t+1):
    a,b=map(int,input().split())
    print('#'+str(tc),end=' ')
    if a==b:
        print(a)
    else:
        print(1)