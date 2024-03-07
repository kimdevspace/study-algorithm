from collections import Counter
num=int(input())
for _ in range(2):
    num1=int(input())
    num=num*num1
cnt=Counter(str(num))
for i in range(10):
    print(cnt[str(i)])