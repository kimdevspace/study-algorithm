T = int(input())

for test_case in range(1, T + 1):
    n=int(input())
    ans=0
    arr=list(map(int,input().split()))
    sellPrice=0
    for a in arr[::-1]:
        if a>=sellPrice:
            sellPrice=a
        else:
            ans+=sellPrice-a
    print('#'+str(test_case),ans)