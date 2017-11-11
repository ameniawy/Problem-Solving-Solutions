
def check_case(string):
    '''
        Return True if you want to change case to lower
    '''
    count_lower = 0
    for i in string:
        count_lower += 1 if i.islower() else 0

    return count_lower >= (len(string) - count_lower)
    
word = raw_input()
print word.lower() if check_case(word) else word.upper()