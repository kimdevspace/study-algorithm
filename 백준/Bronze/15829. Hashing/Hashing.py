dic={chr(i):ord(chr(i))-96 for i in range(97,123)}
L=int(input())
str1=str(input())
ans=1
for i in range(len(str1)):
    ans+=dic[str1[i]]*(31**i)
print(ans%1234567891-1)