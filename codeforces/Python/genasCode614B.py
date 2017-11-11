
n = int(raw_input())
tanks = raw_input().split()

zeros = 0
unique = '1'
if '0' in tanks:
    print 0
else:
    for i in tanks:
        if i == '1':
            continue
        elif i[0] == '1' and set(i[1:]) == set(['0']):
            zeros += len(i[1:])
        else:
            unique = i
    print unique + ('0' * zeros)