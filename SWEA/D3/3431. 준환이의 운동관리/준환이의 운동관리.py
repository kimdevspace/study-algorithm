t = int(input())
for tc in range(1, t+1):
    L, U, X = map(int, input().split())
    print('#'+str(tc),end=' ')
    if X > U:
        print(-1)
    elif X < L:
        print(L-X)
    else:
        print(0)