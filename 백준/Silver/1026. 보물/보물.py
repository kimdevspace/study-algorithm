N=int(input())
A=list(map(int,input().split()))
B=list(map(int,input().split()))
A.sort()
s=0
for i in range(N):
    B_max=max(B)
    s+=A[i]*B_max
    B.remove(B_max)
print(s)