def solution(order):
    answer = 0
    stack=[]
    for i,n in enumerate(order):
        stack.append(i+1)
        while stack and stack[-1]==order[answer]:
            stack.pop()
            answer+=1
    return answer