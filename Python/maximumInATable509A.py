
n = int(input())

matrix = list()

for i in range(n):
    temp_row = list()
    for j in range(n):
        if i == 0 or j == 0:
            temp_row.append(1)
        else:
            temp_row.append(0)
    matrix.append(temp_row)

for i in range(1, n):
    for j in range(1, n):
        matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1]

print(matrix[n - 1][n - 1])
