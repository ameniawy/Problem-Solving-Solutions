
n, t = [int(i) for i in raw_input().split()]
queue = raw_input()

for i in range(t):
    queue = queue.replace("BG", "GB")

print queue