for tc in range(1,11):
    x=int(input())
    arr=[list(map(int,input().split())) for _ in range(100)]
    arr_t=list(map(list,zip(*arr)))
    ans=0
    for a in arr_t:
        prev=0
        for n in a:
            if n:
                if n==2 and prev==1:
                    ans+=1
                prev=n
    print('#'+str(tc),ans)