number = int(input("숫자를 입력하세요: "))
#
# for i in range(1, number + 1):
#     print("*" * i)


# for i in range(1, number + 1):
#     print(' ' * (number - i) + '*' * i)

for i in range(1, number + 1):
    stars = "*" * (2 * i - 1)
    space = ' ' * (number - i)
    print(space + stars)