t=int(input())
S=['MON','TUE','WED','THU','FRI','SAT','SUN']
for tc in range(1,t+1):
    day=input()
    ans=S.index('SUN')-S.index(day)
    if ans==0:
        ans=7
    print('#'+str(tc),ans)