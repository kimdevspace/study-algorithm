n,w,L=map(int,input().split())
truck=list(map(int,input().split()))

cur_weight=0
cnt=0
bridge=[0]*w

while len(truck)>0:
    cnt+=1
    cur_weight-=bridge.pop(0)
    if cur_weight+truck[0]<=L:
        cur_weight+=truck[0]
        bridge.append(truck.pop(0))
    else:
        bridge.append(0)
cnt+=w
print(cnt)