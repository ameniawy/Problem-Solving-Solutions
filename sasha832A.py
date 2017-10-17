
x = lambda: list(map(int, input().split()))
n, k = x()
turn = 0
res = n // k

if res % 2 != 0:
    print("YES")
else:
    print("NO")
