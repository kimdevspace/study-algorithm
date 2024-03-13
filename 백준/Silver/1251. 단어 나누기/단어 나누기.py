s=list(input())
tmp=[]
#모든 경우 tmp에 담음
for i in range(1,len(s)-1):
    for j in range(i+1,len(s)):
        a=s[:i]#첫번째구간
        b=s[i:j]#두번째구간
        c=s[j:]#세번째구간
        a.reverse()#뒤집
        b.reverse()#뒤집
        c.reverse()#뒤집
        tmp.append(a+b+c)
tmp.sort()
print(''.join(tmp[0]))