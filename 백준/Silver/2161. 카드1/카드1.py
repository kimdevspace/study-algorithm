from collections import deque
que=deque([i for i in range(1,int(input())+1)])
arr=[]
while len(que)>1:
    n=que.popleft()
    arr.append(n)
    que.append(que.popleft())
for q in que:
    arr.append(q)
for a in arr:
    print(a,end=' ')