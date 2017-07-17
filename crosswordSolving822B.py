
n, m = map(int, raw_input().split())
str1 = raw_input()
str2 = raw_input()
min_count = 99999999999999
changed = []

for i in xrange(m):
    if i + n <= m:
        x = 0
        c = 0
        temp_changed = []
        for j in xrange(i, i + n):
            if str1[x] != str2[j]:
                c += 1
                temp_changed.append(x + 1)
            x += 1
        if c < min_count:
            min_count = c
            changed = temp_changed

print min_count
print ' '.join(map(str,changed))