def solution(s):
    answer=''
    arr=[int(i) for i in s.split()]
    answer=str(min(arr))+' '+str(max(arr))
    return answer