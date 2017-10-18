
import math

l, r, k = map(long, raw_input().split())
flag = False
res = []
val = 1
while val <= r:
    if l <= val <= r:
        res += [val]
        flag = True
    val *= k

print ' '.join(map(str,res)) if flag else -1