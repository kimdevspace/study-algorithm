dic={'black':(0,1),'brown':(1,10),'red':(2,100),'orange':(3,1000),'yellow':(4,10000)
,'green':(5,100000),'blue':(6,1000000),'violet':(7,10000000),'grey':(8,100000000)
,'white':(9,1000000000)}
ans=0
arr=[]
for _ in range(3):
    color=input()
    arr.append(color)
print(int(str(dic[arr[0]][0])+str(dic[arr[1]][0]))*dic[arr[2]][1])