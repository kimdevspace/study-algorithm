N=int(input())
dic={}
for _ in range(N):
    book=input()
    if book not in dic:
        dic[book]=1
    else:
        dic[book]+=1
dic=sorted(dic,key=lambda x:(-dic[x],x))
print(dic[0])