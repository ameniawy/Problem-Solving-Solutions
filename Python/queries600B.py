
import bisect
# this should be done using binary search but i couldnt find a way around it

n, m = [int(i) for i in raw_input().split()]
first = [int(i) for i in raw_input().split()]
first.sort()
second = [int(i) for i in raw_input().split()]

res = [bisect.bisect(first, q) for q in second]

print ' '.join(map(str,res))
