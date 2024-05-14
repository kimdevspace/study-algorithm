t=int(input())
for tc in range(1,t+1):
    n = int(input())
    arr = [list(str(input())) for _ in range(n)]
    mid = n//2
    ans = 0
    for i in range(n//2+1):
        for j in range(mid-i, mid+i+1):
            ans += int(arr[i][j])

    for i in range(n//2+1,n):
        for j in range(i-mid, n-(i-mid)):
            ans += int(arr[i][j])
    print('#'+str(tc),ans)