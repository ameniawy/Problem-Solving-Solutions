
n, k = [int(i) for i in raw_input().split()]
summ = sum(map(int, raw_input().split()))
added = 0

while k > int(round(float(summ) / float(n + added))):
    summ += k
    added += 1

print added