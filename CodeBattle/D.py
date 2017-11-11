
T = int(input())

for _ in range(T):

    a = str(int(input()))
    b = max([int(i) for i in input()])
    # print(a)

    a_original = int(a)

    index_removed = -1
    a_new = "-1"
    a_new_1 = "-1"

    # if b == 9 and a[0] != '9':
    #     print('9' + a[1:])
    # else:
    for i in range(len(a)-1):
        if int(a[i]) < b and int(a[i+1]) < int(a[i]):
            a_new_1 = a[:i] + str(b) + a[i] + a[i+2:]
            index_removed = i + 1
            break

    # if index_removed == -1:
    for i in range(len(a)-1):
        if int(a[i+1]) > int(a[i]):
            index_removed = i

            if int(a[i+1]) > b:
                a_new = a[:i] + a[i+1] + str(b) + a[i+2:]
                # print("here", len(a_new), len(a), i)
            else:
                a_new = a[:i] + str(b) + a[i+1] + a[i+2:]
            break

    if index_removed == -1:
        if len(a) > 1 and int(a[i]) < b:
            a_new = str(b) + a[1:]
        elif len(a) == 1 and int(a[0]) < b:
            a_new = str(b)

        # if int(a[0]) > b:
        #     a_new = str(b) + a[1:]
    # print(a_new)
    a_new = a_new if int(a_new) > int(a_new_1) else a_new_1
    if int(a_new) > a_original:
        print(a_new)
    else:
        print('impossible')
