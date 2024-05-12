t=int(input())
for tc in range(1,t+1):
    s=input()
    n=len(s)
    print('#'+str(tc),end=' ')
    if s==s[::-1] and s[:(n-1)//2]==s[:(n-1)//2][::-1] and s[(n-1)//2+1:]==s[(n-1)//2+1:][::-1]:
        print('YES')
    else:
        print('NO')