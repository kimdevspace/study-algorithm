while True:
    stack=[]
    str1=input()
    if str1=='.':
        break
    for s in str1:
        if s=='(' or s=='[':
            stack.append(s)
        elif s==')':
            if stack and stack[-1]=='(':
                stack.pop()
            else:
                stack.append(s)
                break
        elif s==']':
            if stack and stack[-1]=='[':
                stack.pop()
            else:
                stack.append(s)
                break
    if not stack:
        print('yes')
    else:
        print('no')