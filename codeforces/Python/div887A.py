
string = input()

if len(string) < 6:
    print("no")
else:
    if '0' not in string:
        print("no")
    else:
        flag = False
        count = 0
        for i in string:
            if i == '1':
                flag = True
            if i == '0' and flag:
                count += 1

        if flag and count >= 6:
            print("yes")
        else:
            print("no")
