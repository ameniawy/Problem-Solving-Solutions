n, k = [int(i) for i in raw_input().split()]
nums = [int(i) for i in raw_input().split()]

for idx, i in enumerate(nums):
    if i < 0 and k > 0:
        nums[idx] = i * -1
        k -= 1
    else:
        break

if k > 0:
    if k % 2 != 0:
        nums[nums.index(min(nums))] = -1 * min(nums)

print sum(nums)