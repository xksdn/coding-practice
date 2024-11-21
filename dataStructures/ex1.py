def insertion_sort(data):
    for i in range(1, len(data)):
        key = data[i]
        j = i -1
        while j >= 0 and key < data[j]:
            data[j+1] = data[j]
            j -= 1
        data[j+1] = key

# 테스트 코드
list_1 = [9, 4, 2, 3, 1, 8, 1]
list_2 = [1, 2, 5, 2, 10, 16, 2]
list_3 = [10, 8, 6, 4, 2, 1]

insertion_sort(list_1)
insertion_sort(list_2)
insertion_sort(list_3)

print(list_1)
print(list_2)
print(list_3)
