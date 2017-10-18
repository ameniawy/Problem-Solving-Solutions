
dict1 = {}
for idx, i in enumerate(raw_input()):
    dict1[i] = idx

array = raw_input()
sentence = raw_input()
out = ''
nums = ["0","1","2","3","4","5","6","7","8","9"]

for char in sentence:
    if char not in nums:
        x = array[dict1.get(char.lower())]
        j = x.upper() if char.isupper() else x.lower()
    else:
        j = char
    out += j

print out