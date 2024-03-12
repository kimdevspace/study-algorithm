N,M=map(int,input().split())
A=[list(map(int,input().split())) for _ in range(N)]
M1,K=map(int,input().split())
B=[list(map(int,input().split())) for _ in range(M1)]
ans=[[0 for i in range(len(B[0]))] for i in range(len(A))]
for i in range(len(A)):
    for j in range(len(B[0])):
        for k in range(len(A[0])):
            ans[i][j]+=A[i][k]*B[k][j]
for a in ans:
    print(*a)
