
n, m = list(map(int, input().split()))
arr = sorted(list(map(int, input().split())))

least_diff = 9999999
for i in range(m):
    if i + n - 1 >= m:
        break

    least_diff = min(least_diff, arr[i+n-1] - arr[i])
    i += 1

print(least_diff)

