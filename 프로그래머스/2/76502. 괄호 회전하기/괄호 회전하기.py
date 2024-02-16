def solution(s):
    n=len(s)
    dp=s
    s=list(2*s)
    answer=0
    for i in range(n):
        stack=[]
        dp=s[i:n+i]
        for j in dp:
            if j=='(' or j=='{' or j=='[':
                stack.append(j)
            else:
                if stack:
                    if stack[-1]=='(' and j==')':
                        stack.pop()
                    elif stack[-1]=='[' and j==']':
                        stack.pop()
                    elif stack[-1]=='{' and j=='}':
                        stack.pop()
        if len(stack)==0:
            answer+=1
        if answer==n:
            answer=0
    return answer