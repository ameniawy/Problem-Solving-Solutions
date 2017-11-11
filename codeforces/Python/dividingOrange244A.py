def diff(first, second):
    second = set(second)
    return [item for item in first if item not in second]

n, k = [int(i) for i in raw_input().split()]
segments_wanted = [int(i) for i in raw_input().split()]

# each child gets exactly n orange segments
all_segments = [i for i in xrange(1, n*k + 1)]

unwanted = diff(all_segments, segments_wanted)

for seg in segments_wanted:
    res = [seg]
    count = n - 1
    for idx, i in enumerate(unwanted):
        if count <= 0:
            break
        if i == -1:
            continue
        
        res += [i]
        unwanted[idx] = -1
        count -= 1
    
    print ' '.join(map(str,res))