
n, m = list(map(int, input().split()))

l1 = list(map(int, input().split()))
l2 = list(map(int, input().split()))

n1 = min(l1)
n2 = min(l2)
intersection = set(l1).intersection(l2)

if len(intersection) != 0:
    print(min(intersection))
else:
    if n1 > n2:
        print(str(n2)+str(n1))
    else:
        print(str(n1)+str(n2))    
