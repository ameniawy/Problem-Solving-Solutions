# python 3.5.2 @ameniawy

n = int(input())
lab = [list(map(int, input().split())) for _ in range(n)]


def check(i, j):
    val = lab[i][j]
    for p in range(n):
        row = lab[i][p]
        for q in range(n):
            if val == row + lab[q][j]:
                return True
    return False


flag = True
for i in range(n):
    for j in range(n):
        if lab[i][j] != 1:
            if not check(i, j):
                flag = False
                break
print("Yes") if flag else print("No")
