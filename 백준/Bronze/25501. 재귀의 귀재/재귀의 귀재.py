def recursion(word,l,r):
    global cnt
    if l>=r:
        return 1
    elif word[l]!=word[r]:
        return 0
    else:
        cnt+=1
        return recursion(word,l+1,r-1)
def isPall(word):
    return recursion(word,0,len(word)-1)
t=int(input())
for _ in range(t):
    cnt=0
    word=input()
    print(isPall(word),cnt+1)