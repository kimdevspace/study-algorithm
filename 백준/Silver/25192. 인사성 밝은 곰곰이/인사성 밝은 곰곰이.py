ans=set()
n=int(input())
c=0
for _ in range(n):
    str1=str(input())
    if str1=='ENTER':
        c+=len(ans)
        ans=set()
    if str1!='ENTER':
        ans.add(str1)
print(c+len(ans))