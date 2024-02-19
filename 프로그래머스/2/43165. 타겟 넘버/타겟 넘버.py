answer=0
def dfs(idx,value,numbers,target):
    global answer
    #탈출조건
    if idx==len(numbers):
        if value==target:
            answer+=1
        return
    #수행동작
    dfs(idx+1,value+numbers[idx],numbers,target)
    dfs(idx+1,value-numbers[idx],numbers,target)
def solution(numbers, target):
    dfs(0,0,numbers,target)
    return answer