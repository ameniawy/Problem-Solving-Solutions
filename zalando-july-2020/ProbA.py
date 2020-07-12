

def solution(N):
    # write your code in Python 3.6
    sum_digits = get_sum(N)

    current = N + 1

    while True:
        current_sum = get_sum(current)

        if current_sum == sum_digits:
            return current

        current += 1

def get_sum(N):
    return sum([int(i) for i in str(N)])



print(solution(734))