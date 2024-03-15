def days(y,m,d):
    res=365*(y-1)+d-1
    for i in range(1,y):
        if not i%400 or (not i%4 and i%100):
            res+=1
    for i in range(1,m):
        if i in [1,3,5,7,8,10,12]:
            res+=31
        elif i==2:
            if not y%400 or (not y%4 and y%100):
                res+=29
            else:
                res+=28
        else:
            res+=30
    return res
y1,m1,d1=map(int,input().split())
y2,m2,d2=map(int,input().split())
if y2-y1>1000 or (y2-y1==1000 and m1<=m2 and d1<=d2):
    print('gg')
else:
    print('D-'+str(days(y2,m2,d2)-days(y1,m1,d1)))