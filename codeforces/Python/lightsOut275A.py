'''
1 0 0
0 0 0
0 0 1
'''
matrix = [map(int, raw_input().split()) for i in xrange(3)]
for i in xrange(3):
    res = ''
    for j in xrange(3):
        total = 1   
        for x, y in ((-1, 0), (0, -1), (0, 0), (0, 1), (1, 0)):
            if 0 <= i + x < 3 and 0 <= j + y < 3:
                total += matrix[i + x][j + y]
        res += str(total % 2)
    print res