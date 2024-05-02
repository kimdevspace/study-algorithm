import sys
input=sys.stdin.readline

nums=[]
for i in range(123,988):
    stri=str(i)
    if stri[0]!=stri[1] and stri[0]!=stri[2] and stri[1]!=stri[2]:
        if stri[0]!='0' and stri[1]!='0' and stri[2]!='0':
            nums.append(stri)

n=int(input())
for _ in range(n):
    num,s,b=map(int,input().split())
    str_num=str(num)
    tmp=[]
    for number in nums:
        tmps,tmpb=0,0
        for i in range(3):
            for j in range(3):
                if str_num[i]==number[j]:
                    if i==j:
                        tmps+=1
                        break
                    tmpb+=1
        if tmps==s and tmpb==b:
            tmp.append(number)
    nums=tmp
print(len(nums))