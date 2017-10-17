
s, e = input().split()
n = int(input()) % 4
directions = ['^', '>', 'v', '<']

def find(x):
    for idx, i in enumerate(directions):
        if i == x:
            return idx

if n % 2 == 0:
    print('undefined')
else:
    start_idx = find(s)
    if directions[(start_idx + n) % 4] == e:
        print('cw')
    else:
        print('ccw')
