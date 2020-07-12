# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(U, L, C):
    # write your code in Python 3.6
    upper = ["0"] * len(C)
    lower = ["0"] * len(C)

    for idx, c_of_k in enumerate(C):
        if c_of_k == 0:
            continue

        if c_of_k == 2:
            U -= 1
            L -= 1
            upper[idx] = "1"
            lower[idx] = "1"

        if c_of_k == 1:
            if U >= L:
                U -= 1
                upper[idx] = "1"
            else:
                L -= 1
                lower[idx] = "1"


    if U != 0 or L != 0:
        return "IMPOSSIBLE"

    return "".join(upper) + "," + "".join(lower)


print(solution(3, 2, [2,1,1,0,1]))
