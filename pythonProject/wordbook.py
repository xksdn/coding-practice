with open('vocabulary.txt', 'r', encoding='UTF-8') as f:
    for line in f:
        word = line.strip().split(": ")
        answer = input((f"{word[1]}: "))
        if answer != word[0]:
            print(f"아쉽습니다. 정답은 {word[0]}입니다.")
        elif answer == word[0]:
            print("맞았습니다!")