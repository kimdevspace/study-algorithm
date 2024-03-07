lst=list(map(int,input().split()))
ascen=[1,2,3,4,5,6,7,8]
descen=[8,7,6,5,4,3,2,1]
if lst==ascen:
    print('ascending')
elif lst==descen:
    print('descending')
else:
    print('mixed')