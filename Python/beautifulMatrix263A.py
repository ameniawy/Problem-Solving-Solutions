
lists = [([int(i) for i in raw_input().split()]) for x in xrange(5)]
x = y = 0

for i in xrange(5):
    for j in xrange(5):
        if lists[i][j] == 1:
            x, y = (i+1), (j+1)
            break

print abs(x-3) + abs(y-3)