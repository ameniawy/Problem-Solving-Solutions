
number_of_pages, v0, max_number_of_pages, a, l = list(map(int, input().split()))
prev = 0
days = 0
read = v0
while number_of_pages > 0:
    days += 1
    today = read - min(l, prev)
    number_of_pages -= today
    prev = read
    read = min(max_number_of_pages, read + a)

print(days)
