

def value(i, remW):
    if i == N or remW == 0:
        return 0

    if memo[i][remW] != -1:
        return memo[i][remW]

    if weight[i] > remW:
        memo[i][remW] = value(i + 1, remW)
        return memo[i][remW]

    memo[i][remW] = max(value(i + 1, remW), price[i] +
                        value(i + 1, remW - weight[i]))
    return memo[i][remW]


if __name__ == '__main__':
    T = int(input())
    final = []

    for _ in range(T):
        global N
        global price
        global weight
        global memo
        N = int(input())
        price = []
        weight = []
        memo = []
        for _ in range(40):
            memo.append([-1 for _ in range(1010)])

        for _ in range(N):
            line = list(map(int, input().split()))
            price.append(line[0])
            weight.append(line[1])

        max_w = max(weight)
        # max_p = max(price)

        G = int(input())
        max_weights = []
        res = 0
        for _ in range(G):
            curr = int(input())
            res += value(0, curr)

        print(res)
