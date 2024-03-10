dic={}
N,M=map(int,input().split())
for _ in range(N):
    ad,pw=map(str,input().split())
    if ad not in dic:
        dic[ad]=pw
for _ in range(M):
    find=input()
    if find in dic:
        print(dic[find])
