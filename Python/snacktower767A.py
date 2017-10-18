import os

number_snacks = raw_input()
snacks = list(map(int,raw_input().split(' ')))

items = set()
index = int(number_snacks)


for i in range(len(snacks)):
	z = snacks[i]
	if z == index:
		printed = [z]
		index = index - 1
		while index in items:
			printed.append(index)
			index = index - 1 
		print(' '.join([str(i) for i in printed]))
	else:
		items.add(z)
		print('')

