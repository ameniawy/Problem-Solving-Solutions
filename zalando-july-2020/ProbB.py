# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(A, B):
    # write your code in Python 3.6
    cum_sum_A = get_cum_sum(A)
    cum_sum_B = get_cum_sum(B)

    if len(A) != len(B):
        return 0

    last_idx = len(cum_sum_A) - 1

    if cum_sum_A[last_idx] != cum_sum_B[last_idx]:
        return 0

    count = 0

    for idx in range(1, len(A)):
        if cum_sum_A[idx -1] == cum_sum_B[idx - 1]:
            left_sum = cum_sum_A[idx -1]
            right_sum = cum_sum_B[last_idx] - left_sum
            if left_sum == right_sum:
                count += 1
    return count

    

def get_cum_sum(arr):
    cum_sum = [0] * len(arr)

    prev = 0

    for idx, num in enumerate(arr):
        cum_sum[idx] = prev + arr[idx]
        prev = cum_sum[idx]
    return cum_sum

print(solution([3, 2, 6], [4, 1, 6]))