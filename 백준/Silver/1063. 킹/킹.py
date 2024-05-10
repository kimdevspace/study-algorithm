dic={'R':[1,0],'L':[-1,0],'B':[0,-1],'T':[0,1]
     ,'RT':[1,1],'LT':[-1,1],'RB':[1,-1],'LB':[-1,-1]}
king, stone, n = input().split()

k=[ord(king[0])-65, int(king[1])-1]
s=[ord(stone[0])-65, int(stone[1])-1]

for _ in range(int(n)):
    move=input()
    nx,ny=k[0]+dic[move][0],k[1]+dic[move][1]
    if 0<=nx<8 and 0<=ny<8:
        if nx==s[0] and ny==s[1]:
            sx=s[0]+dic[move][0]
            sy=s[1]+dic[move][1]
            if 0<=sx<8 and 0<=sy<8:
                k=[nx,ny]
                s=[sx,sy]
        else:
            k=[nx,ny]
print(str(chr(k[0]+65))+str(k[1]+1))
print(str(chr(s[0]+65))+str(s[1]+1))