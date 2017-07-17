
n, one_seater, two_seater = map(int, raw_input().split())
groups = map(int, raw_input().split())

dismissed = 0
one_person_in_two_seater = 0

for group in groups:
    if group == 1:
        if one_seater > 0:
            one_seater -= 1
        elif two_seater > 0:
            two_seater -= 1
            one_person_in_two_seater += 1
        elif one_person_in_two_seater > 0:
            one_person_in_two_seater -= 1
        else:
            dismissed += 1
    else:
        if two_seater > 0:
            two_seater -= 1
        else:
            dismissed += 2

print dismissed