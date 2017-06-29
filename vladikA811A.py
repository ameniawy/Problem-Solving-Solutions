
inp = raw_input()

vlad, val = [int(i) for i in inp.split()]

i = 1

while True:
    if i % 2 == 1:
        vlad = vlad - i
        if vlad < 0:
            print 'Vladik'
            break
    else:
        val = val - i
        if val < 0:
            print 'Valera'
            break

    i += 1
