t=int(input())
for tc in range(1,t+1):
    word=input()
    ans=''
    for w in word:
        if w not in ['a','e','i','o','u']:
            ans+=w
    print('#'+str(tc),ans)