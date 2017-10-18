
year = raw_input()
i = int(year) + 1

def check(x):
    unique = []
    for p in str(x):
        if p in unique:
            return False
        unique += [p]
    return True

while True:
    if check(i):
        break
    i += 1

print i