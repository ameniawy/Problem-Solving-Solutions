
k = int(input())
k2 = k
s = input()
if len(s) < k:
    print("NO")
else:
    res = []
    curr = dups = ""
    for idx, el in enumerate(s):
        if el not in dups:
            dups += el
            if len(curr) > 0:
                k -= 1
                res.append(curr)
            if k == 1:
                res.append(s[idx:])
                break
            curr = el
        else:
            curr += el

    if len(res) != k2:
        print("NO")
    else:
        print("YES")
        [print(el) for el in res]
