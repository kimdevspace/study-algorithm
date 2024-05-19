for tc in range(int(input())):
    N,K=map(int,input().split())
    arr=list(map(int,input().split()))
    arr.sort(reverse=True)
    print('#'+str(tc+1),sum(arr[:K]))