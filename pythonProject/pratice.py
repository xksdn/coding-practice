import random

count = 4
number = random.randint(1, 20)

for i in range(4):
    chance = int(input(f"기회가 {count}번 남았습니다. 1~20 사이의 숫자를 맞혀 보세요:"))
    if number == chance:
        print(f"축하합니다. {5 - count}번 만에 숫자를 맞히셨습니다.")
        break
    elif number < chance and count > 1:
        count -= 1
        print("Down")
    elif number > chance and count > 1:
        count -= 1
        print("Up")
    elif count == 1:
        print(f"아쉽습니다. 정답은 {number}입니다.")
        break