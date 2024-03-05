import sys
input=sys.stdin.readline
n,m=map(int,input().split())
dic={}
for _ in range(n):
    word=input().rstrip()
    if len(word)>=m:
        if word not in dic:
            dic[word]=1
        else:
            dic[word]+=1
arr=dic.keys()
sorted_word=sorted(arr,key=lambda x:(-dic[x],-len(x),x))
for sw in sorted_word:
    print(sw)