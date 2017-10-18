
n, t = map(int, raw_input().split())
cells = map(int, raw_input().split())
i = 0
while i < t - 1:
    i += cells[i]

print 'YES' if i == t - 1 else 'NO'