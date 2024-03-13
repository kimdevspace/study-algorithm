X=input()
cnt=0
while len(X)>1:
    cnt+=1
    ans=0
    for i in X:
        ans+=int(i)
    X=str(ans)
print(cnt)
if int(X)%3==0:
    print('YES')
else:
    print('NO')