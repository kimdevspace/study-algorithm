t=int(input())
for tc in range(1,t+1):
    arr=list(map(int,input().split()))
    h=0
    m=arr[1]+arr[3]
    if m>=60:
        m=m%60
        h+=1
    h+=arr[0]+arr[2]
    if h>12:
        h-=12
    print('#'+str(tc),h,m)