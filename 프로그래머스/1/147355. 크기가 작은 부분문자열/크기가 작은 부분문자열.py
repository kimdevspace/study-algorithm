def solution(t, p):
    a=[]
    c=0
    for i in range(len(t)):
        if len(t[i:i+len(p)])>=len(p):
            a.append(t[i:i+len(p)])
    for i in a:
        if int(i)<=int(p):
            c+=1
    return c