lst=[]
N=int(input())
for _ in range(N):
    str1=input().split()
    lst.append(str1)
lst.sort(key=lambda x:-int(x[2]))
print(*lst[0][:2])
print(*lst[1][:2])
i=2
if lst[0][0]==lst[1][0]:
    while lst[0][0]==lst[i][0]:
        i+=1
print(*lst[i][:2])