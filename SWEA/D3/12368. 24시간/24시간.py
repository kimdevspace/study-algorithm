for tc in range(1,int(input())+1):
    a,b=map(int,input().split())
    c=a+b
    if c>=24:
        c-=24
    print('#'+str(tc),c)