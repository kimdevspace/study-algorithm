move={'R':[1,0],'L':[-1,0],'B':[0,-1],'T':[0,1]
      ,'RT':[1,1],'LT':[-1,1],'RB':[1, -1],
      'LB':[-1,-1]}

king,rock,n=input().split()
n=int(n)

k=[ord(king[0])-65,int(king[1])-1]
r=[ord(rock[0])-65,int(rock[1])-1]

for _ in range(n):
    m=input()
    nx=k[0]+move[m][0]
    ny=k[1]+move[m][1]

    if 0<=nx<8 and 0<=ny<8:
        if nx==r[0] and ny==r[1]:
            rx=r[0]+move[m][0]
            ry=r[1]+move[m][1]
            if 0<=rx<8 and 0<=ry<8:
                k=[nx,ny]
                r=[rx,ry]
        else:
            k=[nx,ny]
            
print(str(chr(k[0]+65))+str(k[1]+1))
print(str(chr(r[0]+65))+str(r[1]+1))