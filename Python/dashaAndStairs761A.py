l, r = list(map(int, input().split()))
print("YES" if abs(l - r) <= 1 and (l + r) > 0 else "NO")
