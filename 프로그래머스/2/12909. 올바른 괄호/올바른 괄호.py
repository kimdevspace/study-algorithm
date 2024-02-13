def solution(s):
    stack=[]
    for i in s:
        if i=='(':
            stack.append(i)
        elif i==')' and len(stack)==0:
            stack.append(i)
        elif i==')' and len(stack)>0:
            stack.pop()
    return True if len(stack)==0 else False