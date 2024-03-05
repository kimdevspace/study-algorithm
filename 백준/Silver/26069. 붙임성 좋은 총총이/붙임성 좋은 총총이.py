n=int(input())
dance=['ChongChong']
for _ in range(n):
    name1,name2=map(str,input().split())
    if name1 in dance:
        dance.append(name2)
    elif name2 in dance:
        dance.append(name1)
print(len(set(dance)))