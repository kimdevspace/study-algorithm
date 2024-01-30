def solution(arr):
    return [-1] if 2 not in arr else arr[arr.index(2):len(arr)-arr[::-1].index(2)]