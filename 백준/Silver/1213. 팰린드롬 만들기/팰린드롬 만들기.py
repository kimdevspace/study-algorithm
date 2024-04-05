from collections import Counter
word=input()
check=Counter(word)
mid=''
res=''
cnt=0
for key,value in list(check.items()):
    if value%2==1:
        cnt+=1
        mid=key
        if cnt>=2:
            print("I'm Sorry Hansoo")
            exit(0)
for key,value in sorted(check.items()):
    res+=(key*(value//2))
print(res+mid+res[::-1])