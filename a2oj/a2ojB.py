
test_cases = int(raw_input())

for _ in xrange(test_cases):
    n, m = map(int, raw_input().split())
    scores = [int(raw_input()) for _ in xrange(n)]
    scores = sorted(scores, reverse=True)
    min_score = scores[m-1]
    qualify = m
    for i in xrange(m - 1, -1, -1):
        if scores[i] == 0:
            qualify -= 1
            min_score = -99
        else:
            break

    for score in scores[m:]:
        if score == min_score:
            qualify += 1
        else:
            break
    print qualify
