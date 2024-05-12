t=int(input())
for tc in range(1,t+1):
    p,q,r,s,w=map(int,input().split())
    A=w*p
    B=q if w<=r else q+(w-r)*s
    print('#'+str(tc),min(A,B))