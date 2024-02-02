def solution(arr):
    stk=[]
    for i in range(len(arr)):
        if len(stk)==0:
            stk.append(arr[i])
            i+=1
        elif len(stk)>=1 and stk[-1]==arr[i]:
            stk.pop()
            i+=1
        elif len(stk)>=1 and stk[-1]!=arr[i]:
            stk.append(arr[i])
            i+=1
    if len(stk)==0:
        return [-1]
    return stk