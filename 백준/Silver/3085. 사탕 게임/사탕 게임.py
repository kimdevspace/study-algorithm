n=int(input())
arr=[list(input()) for _ in range(n)]
ans=int(-1e9)

def check():
    max_cnt=1
    for i in range(n):
        cnt=1
        for j in range(1,n):
            if arr[i][j]==arr[i][j-1]:
                cnt+=1
            else:
                cnt=1
            max_cnt=max(cnt,max_cnt)
        
        cnt=1
        for j in range(1,n):
            if arr[j][i]==arr[j-1][i]:
                cnt+=1
            else:
                cnt=1
            max_cnt=max(cnt,max_cnt)
    return max_cnt

for i in range(n):
    for j in range(n-1):
        if j+1<n and arr[i][j]!=arr[i][j+1]:
            arr[i][j],arr[i][j+1]=arr[i][j+1],arr[i][j]
            ans=max(ans,check())
            arr[i][j],arr[i][j+1]=arr[i][j+1],arr[i][j]
        if i+1<n and arr[i][j]!=arr[i+1][j]:
            arr[i][j],arr[i+1][j]=arr[i+1][j],arr[i][j]
            ans=max(ans,check())
            arr[i][j],arr[i+1][j]=arr[i+1][j],arr[i][j]
print(ans)