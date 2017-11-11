
movements = int(raw_input())
final_position = int(raw_input())

position = final_position
# swap middle with left on odd move
# swap middle with right on even move

if movements > 6:
    movements_left = movements % 6
    movements = movements_left

while movements > 0:
    if movements % 2 == 0:
        if position != 0:
            position = 2 if position == 1 else 1
    else:
        if position != 2:
            position = 0 if position == 1 else 1
    movements -= 1

print position
