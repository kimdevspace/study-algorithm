for tc in range(1,11):
    t=int(input())
    arr=[list(input()) for _ in range(100)]
    arr_t=list(map(list,zip(*arr)))
    ans=[]
    for a in arr:
        for i in range(len(a)):
            for j in range(i,len(arr)):
                if a[i:j+1]==a[i:j+1][::-1]:
                    ans.append(len(a[i:j+1]))
    for at in arr_t:
        for i in range(len(at)):
            for j in range(i,len(arr_t)):
                if at[i:j+1] == at[i:j+1][::-1]:
                    ans.append(len(at[i:j+1]))
    print('#'+str(t),max(ans))