stack=[]
str1=input()+' '
ans=''
check=False
for s in str1:
    if s=='<':
        check=True
        for _ in range(len(stack)):
            ans+=stack.pop()
    stack.append(s)
    if s=='>':
        check=False
        for _ in range(len(stack)):
            ans+=stack.pop(0)
    if s==' ' and check==False:
        stack.pop()
        for _ in range(len(stack)):
            ans+=stack.pop()
        ans+=' '
print(ans)