T = int(raw_input())
res = []

for _ in xrange(T):
    x,y = map(int, raw_input().split())
    res.append(str(x+y))

print('\n'.join(res))