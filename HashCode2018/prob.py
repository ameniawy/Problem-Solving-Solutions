
from collections import defaultdict
import random


def read_file(file_name):
    with open(file_name, "r") as f:
        data = f.readlines()
        return data


file_names = ['a_example', 'b_should_be_easy',
              'c_no_hurry', 'd_metropolis', 'e_high_bonus']

file_name = file_names[4]
data = read_file(file_name + '.in')

output = open(file_name + '.out', "w")
# print(data)

R, C, F, N, B, T = list(map(int, data[0].strip().split()))

rides = list()

for idx, r in enumerate(data[1:]):
    ride = list(map(int, r.split()))
    rides.append({
        "index": idx,
        "a": ride[0],
        "b": ride[1],
        "x": ride[2],
        "y": ride[3],
        "s": ride[4],
        "f": ride[5],
        "distance": abs(ride[0] - ride[2]) + abs(ride[1] - ride[3])
    })


# rides sorted by latest finish
rides = sorted(rides, key=lambda x: (x["s"], x["distance"]))
# print(rides)

cars = [{"index": c, "location": (0, 0), "free": 0, "rides": [
], "current_ride": -1} for c in range(F)]

time_dict = defaultdict(list)

time_dict["0"] = [idx for idx, car in enumerate(cars)]
# print(time_dict["0"])

rides_index = 0

for t in range(T):
    if len(time_dict[str(t)]) == 0:
        continue

    avail = time_dict[str(t)]
    random.shuffle(avail)

    len_avail = len(avail)

    for _ in range(len_avail):

        cc = 1
        current_ride = rides[rides_index]
        if rides_index + 1 == N:
            break

        rides_index += 1


        min_dist = 9999999999999
        min_index = -1
        for car_sorted in avail:
            current_car = cars[car_sorted]
            current_distance = abs(current_ride["a"] - current_car["location"][0]) + abs(
                current_ride["b"] - current_car["location"][1])

            if current_distance < min_dist:
                min_dist = current_distance
                min_index = current_car["index"]

        cc = min_index
        
        # if current_ride['s'] > t + min_dist:
        #     continue

        avail.remove(cc)
            

        # add history to finished cars
        if cars[cc]["current_ride"] != -1:
            cars[cc]["rides"].append(cars[cc]["current_ride"])
            cars[cc]["current_ride"] = -1

        current_car = cars[cc]

        # print(current_ride)

        end_time = current_ride["distance"] + max(current_ride["s"], t + abs(
            current_ride["a"] - current_car["location"][0]) + abs(current_ride["b"] - current_car["location"][1]))
        if end_time < T:
            time_dict[str(end_time)].append(current_car["index"])

        # update car info
        cars[cc]["location"] = (current_ride["x"], current_ride["y"])
        cars[cc]["current_ride"] = rides_index - 1
        # print(cars[cc]["current_ride"])

# print(time_dict)

for car in cars:
    pp = str(len(car["rides"])) + ' ' + \
        ' '.join(list(map(str, car["rides"]))) + '\n'
    output.write(pp)
    print(pp)
    # print(car)


output.close()
