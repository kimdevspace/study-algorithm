num=set(range(1,10001))
none_self=set()
for i in range(1,10001):
    for j in str(i):
        i+=int(j)
    none_self.add(i)
self_num=sorted(num-none_self)
for s in self_num:
    print(s)