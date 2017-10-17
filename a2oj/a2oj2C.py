
n = int(input())
arr = list(map(int, input().split()))
arr_2 = arr.copy()

count_1 = 0
i = 0

while i < n - 2:
    if arr[i] + arr[i+1] < arr[i+2]:
        arr[i+1] = arr[i] + arr[i+1]
        count_1 += 1
    i += 1

count_2 = 0
i = n - 2
while i > 0:
    if arr_2[i] + arr_2[i-1] < arr_2[i+1]:
        arr_2[i-1] = arr_2[i] + arr_2[i-1]
        arr_2[i] = arr_2[i+1]

        count_2 += 1
    i -= 1

print(max(count_1, count_2))
