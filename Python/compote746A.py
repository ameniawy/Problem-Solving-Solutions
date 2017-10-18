
lemons = int(raw_input())
apples = int(raw_input())
pears = int(raw_input())

res = 0

while True:
    if (lemons - 1 >= 0) & (apples - 2 >= 0) & (pears - 4 >= 0):
        res += 7
        lemons -= 1
        apples -= 2
        pears -= 4
    else:
        break

print res 
