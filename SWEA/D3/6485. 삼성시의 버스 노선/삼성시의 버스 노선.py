t=int(input())
for tc in range(1,t+1):
    n=int(input())
    arr=[0]*5001
    for _ in range(n):
        a,b=map(int,input().split())
        for i in range(a,b+1):
            arr[i]+=1
    p=int(input())
    print('#'+str(tc),end=' ')
    for i in range(p):
        num=int(input())
        print(arr[num],end=' ')
    print()