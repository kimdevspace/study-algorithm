for tc in range(1,11):
    n=int(input())
    arr=[list(input()) for _ in range(8)]
    arr_t=list(map(list,(zip(*arr))))
    ans=0
    for a in arr:
        for i in range(8-n+1):
            check=a[i:i+n]
            if check==check[::-1]:
                ans+=1
    for at in arr_t:
        for j in range(8-n+1):
            check1=at[j:j+n]
            if check1==check1[::-1]:
                ans+=1
    print('#'+str(tc),ans)