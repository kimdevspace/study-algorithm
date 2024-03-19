def solution(n):
    def hanoi(n,start,end,other):
        if n==1:
            ans.append([start,end])
            return
        else:
            hanoi(n-1,start,other,end)
            ans.append([start,end])
            hanoi(n-1,other,end,start)
    ans=[]
    hanoi(n,1,3,2)
    return ans