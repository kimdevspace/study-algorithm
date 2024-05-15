for tc in range(1,11):
    t=int(input())
    find_str = input()
    serch_str = input()
    ans = 0
    for i in range(len(serch_str)):
        if find_str == serch_str[i:i+len(find_str)]:
            ans+=1
    print('#'+str(tc),ans)