import math

x = raw_input()
n = int(x)

length = len(x)
summ = 0

if n < 10:
    print n
else:
    for i in xrange(length - 1):
        summ += (i + 1) * 9 * math.pow(10, i)

    maximum = int((length-1) * '9')
    summ += length * (n - maximum)
    print int(summ)