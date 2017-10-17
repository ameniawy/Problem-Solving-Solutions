
test_cases = int(raw_input())

for _ in xrange(test_cases):
    teams = int(raw_input())
    max_team = ''
    max_points = -99
    for _ in xrange(teams):
        line = raw_input().split(' ')
        if int(line[1]) > max_points:
            max_points = int(line[1])
            max_team = line[0]

    print max_team
