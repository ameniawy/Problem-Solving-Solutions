

from collections import defaultdict

n, k = list(map(int, input().split()))

arr = list(map(int, input().split()))

num_map = defaultdict(int)

for val in arr:
    num_map[val] += 1

keys = list(num_map.keys())

# print(keys)
if n == 1:
    print(' '.join(list(map(str, arr))))
elif len(keys) > 2:
    print(-1)
elif len(keys) == 1:
    if k == 0:
        print(' '.join(list(map(str, arr))))
    else:
        print(-1)
else:
    if keys[0] ^ keys[1] != k:
        print(-1)
    else:
        if abs(num_map[keys[0]] - num_map[keys[1]]) > 1:
            print(-1)
        else:
            if num_map[keys[0]] > num_map[keys[1]]:
                res = [keys[0] if i % 2 == 0 else keys[1] for i in range(n)]
                print(' '.join(list(map(str, res))))
            elif num_map[keys[0]] < num_map[keys[1]]:
                res = [keys[1] if i % 2 == 0 else keys[0] for i in range(n)]
                print(' '.join(list(map(str, res))))
            else:
                if keys[0] < keys[1]:
                    res = [keys[0] if i % 2 == 0 else keys[1] for i in range(n)]
                    print(' '.join(list(map(str, res))))
                else:
                    res = [keys[1] if i % 2 == 0 else keys[0] for i in range(n)]
                    print(' '.join(list(map(str, res))))
