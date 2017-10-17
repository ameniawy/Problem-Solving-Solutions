import bisect
n = int(input())
sherlock = input()
mori = sorted([int(i) for i in input()])
mori2 = mori.copy()
sherlock_hits = 0
mori_hits = 0
for i in sherlock:
    el = int(i)
    idx = bisect.bisect(mori, el)
    if mori[idx - 1] == el:
        mori.remove(mori[idx - 1])
        continue
    elif idx != len(mori):
        mori.remove(mori[idx])
    else:
        mori_hits += 1
        mori.remove(mori[0])

print(mori_hits)

for i in sherlock:
    el = int(i)
    idx = bisect.bisect(mori2, el)

    if idx != len(mori2):
        mori2.remove(mori2[idx])
        sherlock_hits += 1
    else:
        mori2.remove(mori2[0])
print(sherlock_hits)
