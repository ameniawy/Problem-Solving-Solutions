
n, t = list(map(int, input().split()))

arr = list(map(int, input().split()))
count = 0

for i in arr:
    if t <= 0:
        break

    t -= (86400 - i)
    count += 1
print(count)
