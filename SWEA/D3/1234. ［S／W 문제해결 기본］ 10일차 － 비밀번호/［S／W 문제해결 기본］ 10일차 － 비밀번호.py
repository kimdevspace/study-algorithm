for tc in range(1,11):
    n,arr=input().split()
    tmp=[]
    for a in arr:
        if not tmp or tmp[-1]!=a:
            tmp.append(a)
        else:
            tmp.pop()
    print('#'+str(tc),''.join(tmp))