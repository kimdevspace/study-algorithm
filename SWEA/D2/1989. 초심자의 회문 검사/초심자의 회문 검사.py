t=int(input())
for tc in range(1,t+1):
    word=input()
    print('#'+str(tc),end=' ')
    if word==word[::-1]:
        print(1)
    else:
        print(0)