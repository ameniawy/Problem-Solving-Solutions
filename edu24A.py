
n, k = [int(i) for i in raw_input().split()]
half = n / 2
dipl = half / (k + 1)

if (dipl + 1) + ((dipl+1) * k) < half:
    dipl += 1

cert = dipl * k

print dipl, cert, (n - dipl - cert)
