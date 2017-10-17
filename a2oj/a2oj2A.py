
n = int(input())

necks = [i for i in input().split()]

max_count = 0

curr_count = 0

for neck in necks:
    curr_count = 0
    ch = neck[0]
    for bead in neck:
        if bead == ch:
            curr_count += 1
        else:
            curr_count = 0
            break
    if curr_count > max_count:
        max_count = curr_count

print(max_count)