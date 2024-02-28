from collections import deque
def solution(order):
    answer=0
    order=deque(order)
    num=deque([i for i in range(1,len(order)+1)])
    stack=[]
    while num:
        if num[0]==order[0]:
            break
        stack.append(num.popleft())
    flag=True 
    while flag and order:
        order_now=order.popleft()
        while True:
            if num and num[0]==order_now:
                num.popleft()
                answer+=1
                break
            if stack and stack[-1]==order_now:
                stack.pop()
                answer+=1
                break
            if not num:
                flag=False
                break
            else:
                stack.append(num.popleft())
    return answer