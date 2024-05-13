t=int(input())
for tc in range(1,t+1):
    x,y,z=map(int,input().split())
    ans=0
    print('#'+str(tc),end=' ')
    if y-x!=z-y:
        print(abs((y-x)-(z-y))/2)
    else:
        print(0.0)