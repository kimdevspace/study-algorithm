n=int(input())
ans=0
for i in range(1,n+1):
    num=list(map(int,str(i)))
    if i<100:
        ans+=1
    elif num[0]-num[1]==num[1]-num[2]:
        ans+=1
print(ans)