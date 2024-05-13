t=int(input())
for tc in range(1,t+1):
    n,m=map(int,input().split())
    str_lst_n=list(map(str,input().split()))
    str_lst_m=list(map(str,input().split()))
    q=int(input())
    print('#'+str(tc),end=' ')
    for _ in range(q):
        y=int(input())
        ans=str_lst_n[(y-1)%len(str_lst_n)]+str_lst_m[(y-1)%len(str_lst_m)]
        print(ans,end=' ')
    print()