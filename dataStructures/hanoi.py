def hanoi(number_of_disks_to_move, from_, to_, via):
    if number_of_disks_to_move == 1:
        print(from_, "->", to_)
    else:
        hanoi(number_of_disks_to_move-1, from_, via, to_)
        print(from_, "->", to_)
        hanoi(number_of_disks_to_move-1, via, to_, from_)


if __name__ == '__main__':
    hanoi(3, 1,3,2)