
string = raw_input()
i = 0
res = ''

while i < len(string):
    val1 = string[i]
    if val1 == '.':
        res += '0'
    else:
        i += 1
        val2 = string[i]
        if val2 == '.':
            res += '1'
        else:
            res += '2'

    i += 1

print res