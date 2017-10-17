
n, m = list(map(int, input().split()))
pages = list(map(int, input().split()))
res = []
inputs = [list(map(int, input().split())) for _ in range(m)]
for row in inputs:
    l, r, x = row
    not_changed = "Yes"
    if l <= x <= r:
        count = 0
        el = pages[x - 1]
        for i in range(l - 1, r):
            if pages[i] < el:
                count += 1

        if count != x - l:
            not_changed = "No"
    res += [not_changed]

for i in res:
    print(i)
