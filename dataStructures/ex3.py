num_list = ['3', '6', '9']

for i in range(1, 100):
    number = str(i)
    if number[-1] in num_list or number[0] in num_list:
        print(number, "짝")
    else:
        print(number)