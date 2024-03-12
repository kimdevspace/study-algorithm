n=int(input())
lst=[list(map(str,input().split())) for _ in range(n)]
lst.sort(key=lambda x:(int(x[3]),int(x[2]),int(x[1])))
print(lst[len(lst)-1][0],lst[0][0],sep='\n')