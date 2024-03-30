list2 = []

for i in range(3):
    name = input("이름을 입력해주세요 : ")
    math = int(input("수학점수를 입력해주세요 : "))
    eng = int(input("영어점수를 입력해주세요 : "))
    kor = int(input("국어점수를 입력해주세요 : "))

    list1 = [name, math, eng, kor, math + eng + kor]
    list2.append(list1)


for i in range(3):
    for j in range(5):
        print(list2[i][j], end=" ")
    print("")