t=int(input())
for tc in range(1,t+1):
    n,m=map(int,input().split())
    A=list(map(int,input().split()))
    B=list(map(int,input().split()))

    if len(A)<len(B):
        ans=0
        for i in range(len(B)-len(A)+1):
            tmp=0
            cut_B=B[i:i+len(A)]
            for j in range(len(cut_B)):
                tmp+=A[j]*cut_B[j]
            ans=max(tmp,ans)
    elif len(A)>len(B):
        ans=0
        for i in range(len(A)-len(B)+1):
            tmp=0
            cut_A=A[i:i+len(B)]
            for j in range(len(cut_A)):
                tmp+=B[j]*cut_A[j]
            ans=max(ans,tmp)
    print('#'+str(tc),ans)