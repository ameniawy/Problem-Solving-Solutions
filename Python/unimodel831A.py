
INCREASING = 0
DECREASING = 1
EQUAL = 2

n = int(raw_input())
array = map(int, raw_input().split())

state = INCREASING
res = True
begin = True

if len(array) > 0:
    prev = array[0]
    
for i in array:
    if i > prev:
        if state != INCREASING:
            res = False
            break
        
    if i < prev:
            state = DECREASING

    if i == prev and not begin:
        if state == DECREASING:
            res = False
            break
        state = EQUAL

    begin = False
    prev = i

print 'YES' if res else 'NO'