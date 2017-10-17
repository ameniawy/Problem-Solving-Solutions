
first_grid = [input() for _ in range(3)]
input()
second_grid = [input() for _ in range(3)]

out = ""

for idx, line in enumerate(first_grid):
    for idx2, char in enumerate(line):
        if char == second_grid[idx][idx2]:
            out = out + char
        else:
            if char == '.':
                out = out + second_grid[idx][idx2]
            elif second_grid[idx][idx2] == '.':
                out = out + char
            else:
                out = out + "X"

    if idx != 2:
        out = out + "\n"

print(out)