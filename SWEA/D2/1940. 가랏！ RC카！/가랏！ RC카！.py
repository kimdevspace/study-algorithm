t=int(input())
for tc in range(1,t+1):
    n=int(input())
    speed=0
    dist=0
    for _ in range(n):
        command=list(map(int,input().split()))
        if command[0]==0:
            dist+=speed
        elif command[0]==1:
            speed+=command[1]
            dist+=speed
        elif command[0]==2:
            if speed<command[1]:
                speed=0
            else:
                speed-=command[1]
                dist+=speed
    print('#'+str(tc),dist)        