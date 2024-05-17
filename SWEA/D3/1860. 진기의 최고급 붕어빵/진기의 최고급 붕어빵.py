t=int(input())
for tc in range(1,t+1):
    n,m,k=map(int,input().split())
    lst=list(map(int,input().split()))
    lst.sort()
    res='Possible'
    for i in range(n):
        if 0 > (lst[i]//m)*k-(i+1):
            res='Impossible'
            break
    print('#'+str(tc),res)
