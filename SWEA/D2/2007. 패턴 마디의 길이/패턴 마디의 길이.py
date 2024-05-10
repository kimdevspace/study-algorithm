t=int(input())
for tc in range(1,t+1):
    string=input()
    pattern=''
    for i in range(1,len(string)+1):
        pattern=string[:i]
        if pattern==string[i:i+len(pattern)]:
            print('#'+str(tc),len(pattern))
            break