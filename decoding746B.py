
length = int(raw_input())
word = raw_input()
res = ""

for i in word:
    if length % 2 == 0:
        res = i + res
    else:
        res = res + i
    length -= 1

print res