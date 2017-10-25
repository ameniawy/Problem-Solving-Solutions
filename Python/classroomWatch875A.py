
n = int(input())

res = []

def sum_digits(x):
    return sum([int(i) for i in x])

for i in range(max(0, n - 80), n):
    if i + sum_digits(str(i)) == n:
        res.append(i)

print(len(res))

if len(res) != 0:
    for r in sorted(res):
        print(r)