def solution(arr):
    answer = [0,0]
    n=len(arr)
    def comp(a,b,n):
        start=arr[a][b]
        for i in range(a,a+n):
            for j in range(b,b+n):
                if start!=arr[i][j]:
                    n//=2
                    comp(a,b,n)
                    comp(a+n,b,n)
                    comp(a,b+n,n)
                    comp(a+n,b+n,n)
                    return
        answer[start]+=1
    comp(0,0,n)
    return answer