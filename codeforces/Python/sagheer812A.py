
roads = [raw_input().split() for i in range(4)]

def check(i):
    # check self
    if roads[i][0] == '1' or roads[i][1] == '1' or roads[i][2] == '1':
        return True
    
    # check left going right
    if roads[(i+3) % 4][2] == '1':
        return True

    # check straight going straight
    if roads[(i+2) % 4][1] == '1':
        return True

    # check right going left
    if roads[(i+1) % 4][0] == '1':
        return True
    

    return False


res = False

for i in range(4):
    if roads[i][3] == '0': # no peds passing
        continue
    res = check(i)
    if res:
        break
        
print 'YES' if res else 'NO'