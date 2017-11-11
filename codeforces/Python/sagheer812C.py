
n, S = list(map(int, input().split()))
cost = list(map(int, input().split()))
total = 0
k = 0
for idx, i in enumerate(cost):
    p = idx + 1
    margin = ((p - 1) * (p) // 2) + p * (k + 1)
    if total + margin + i <= S:
        total = total + margin + i
        k += 1
    else:
        break

print(k, total)
