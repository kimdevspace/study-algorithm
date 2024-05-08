T = int(input())

for test_case in range(1, T + 1):
    arr=list(map(int,input().split()))
    s=0
    for a in arr:
        if a%2!=0:
            s+=a
    print('#'+str(test_case),s)