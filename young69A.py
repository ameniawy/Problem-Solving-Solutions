
n = int(raw_input())
lists = [([int(i) for i in raw_input().split()]) for x in xrange(n)]
print 'YES' if all([True if i == 0 else False for i in map(sum, zip(*lists))]) else 'NO'