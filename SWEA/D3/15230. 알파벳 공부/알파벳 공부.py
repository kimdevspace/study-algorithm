alpha='abcdefghijklmnopqrstuvwxyz'
T=int(input())
for tc in range(1,T+1):
    word=input()
    l=len(word)
    ans=0
    for i in range(l):
        if word[i]==alpha[i]:
            ans+=1
        else:
            break
    print('#'+str(tc),ans)