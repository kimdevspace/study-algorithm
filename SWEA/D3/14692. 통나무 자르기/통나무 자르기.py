t=int(input())
for tc in range(1,t+1):
    n=int(input())
    print('#'+str(tc),end=' ')
    if n%2==0:
        print('Alice')
    else:
        print('Bob')