import math

n, m = map(int, raw_input().split())
queue = [math.ceil(float(i) / float(m)) for i in raw_input().split()]
q = {}
for idx, val in enumerate(queue):
    q[idx + 1] = val

new = sorted(q.items(), key=lambda x: (x[1],x[0]), reverse=True)
print new[0][0]