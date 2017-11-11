
n, ac, ab, bc = [int(input()) for _ in range(4)]

dist = 0
place = 0

# 0 = a, 1 = b, 2 = c

for _ in range(n - 1):
    if place == 0:  # at q
        if ac > ab:
            dist += ab
            place = 1
        else:
            dist += ac
            place = 2
    elif place == 1:  # at b
        if ab > bc:
            dist += bc
            place = 2
        else:
            dist += ab
            place = 0
    else:  # at c
        if ac > bc:
            dist += bc
            place = 1
        else:
            dist += ac
            place = 0

print(dist)
