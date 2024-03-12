dic={}
n,k=map(int,input().split())
for _ in range(n):
    c,g,s,b=map(int,input().split())
    if c not in dic:
        dic[c]=[g,s,b]
arr=sorted(dic.keys(),key=lambda x:(dic[x][0],dic[x][1],dic[x][2]),reverse=True)
idx=arr.index(k)
for i in range(1,n):
    if dic[idx]==dic[i]:
        print(i)
        break
