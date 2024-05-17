t=int(input())
for tc in range(1,t+1):
    n,k=map(int,input().split())
    num=list(map(int,input().split()))
    lst=[i+1 for i in range(n)]
    for nu in num:
        lst.remove(nu)
    lst.sort()
    print('#'+str(tc),*lst)