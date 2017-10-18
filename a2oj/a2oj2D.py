
from collections import defaultdict
n = int(input())

nums = ['0' * (10 - len(i)) + i for i in input().split()]

hash_map = defaultdict(int)

for idx, num in enumerate(nums):
    new_num = int('9'*len(num)) - int(num)
    big_str = '0'*(len(num) - len(str(new_num))) + str(new_num)

    for i in range(len(num)-1, 0, -1):
        hash_map[big_str[i:]] += 1

max_len = 0
count = n * (n - 1) // 2


for key in hash_map:

    check_this = str(int('9' * len(key)) - int(key))
    check_this = ('0' * (len(key) - len(check_this))) + check_this

    # if hash_map.get(check_this) is not None:
    if check_this in hash_map:
        if len(key) > max_len:
            max_len = len(key)
            count = (hash_map[check_this] * hash_map[key])
        elif len(key) == max_len:
            count += (hash_map[check_this] * hash_map[key])


if count == n * (n - 1) // 2:
    # count = len(nums)
    print("0" + " " + str(count))
else:
    print(str(max_len) + " " + str((count) // 2))
