
n, m = map(int, raw_input().split())
grid = [raw_input() for _ in xrange(n)]

max_width = max_height = -1
min_width = min_height = 10000
count_black = 0

for i in xrange(n):
    for j in xrange(m):
        if grid[i][j] == 'B':
            max_width = max(max_width, j)
            max_height = max(max_height, i)
            min_height = min(min_height, i)
            min_width = min(min_width, j)
            count_black += 1

height = max_height - min_height + 1
width = max_width - min_width + 1

res = -1

if height > width:
    diff = height - width
    if max_width + diff < m or min_width - diff >= 0:
        res = (height * height) - count_black
    elif min_width - (diff - (m - max_width)) >= 0 and height <= m:
        res = (height * height) - count_black

elif height < width:
    diff = width - height
    if max_height + diff < n or min_height - diff >= 0:
        res = (width * width) - count_black
    elif min_height - (diff - (n - max_height)) >= 0 and width <= n:
        res = (width * width) - count_black
else:
    res = (width * width) - count_black

if count_black == 0:
    res = 1

print res