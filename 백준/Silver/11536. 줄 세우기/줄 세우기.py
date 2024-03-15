N=int(input())
name=[]
for i in range(N):
    name.append(input())
name_sort=sorted(name)
if name==name_sort:
    print('INCREASING')
elif name[-1::-1]==name_sort:
    print('DECREASING')
else:
    print('NEITHER')