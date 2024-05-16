t=int(input())
for tc in range(1,t+1):
    n=int(input())
    arr=list(map(str,input().split()))
    m=n//2+1
    if n%2==0:
        m=n//2
    A=arr[:m]
    B=arr[m:]
    ans=[]
    for i in range(len(B)):
        ans.append(A[i])
        ans.append(B[i])
    if n%2==1:
        ans.append(A[-1])
    print('#'+str(tc),' '.join(ans))