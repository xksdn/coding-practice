class Phonebook:
    def __init__(self):
        self.list = {}

    def add_entry(self, name, num):
        if num in self.list.values():
            print("이미 있는 전화번호입니다.")
        else:
            self.list[name] = num
            print("전화번호가 추가되었습니다.")

        sorted_list = sorted(self.list.keys())
        return sorted_list

    def modify(self, name, num):
        if name in self.list.keys():
            self.list[name] = num
            print("수정되었습니다.")
        else:
            print("존재하지 않는 이름입니다.")

    def del_tel(self, name):
        if name in self.list.keys():
            del self.list[name]
            print("삭제되었습니다.")
        else:
            print("존재하지 않는 이름입니다.")

    def search(self, name):
        result =  self.list.get(name, "존재하지 않는 이름입니다.")
        print(result)


def main():
    phonebook = Phonebook()
    while True:
        choice = input("1: 입력, 2:수정, 3:삭제 ,4: 탐색, 5:종료")
        if choice == '1':
            name = input("이름을 입력해주세요: ")
            number = input("전화번호를 입력해주세요: ")
            phonebook.add_entry(name, number)
        elif choice == '2':
            name = input("이름을 입력해주세요: ")
            number = input("전화번호를 입력해주세요: ")
            phonebook.modify(name, number)
        elif choice == '3':
            name = input("이름을 입력해주세요: ")
            phonebook.del_tel(name)
        elif choice == '4':
            name = input("이름을 입력해주세요: ")
            phonebook.search(name)
        elif choice == '5':
            print("프로그램을 종료합니다.")
            break
        else:
            print("다시 입력해주세요")

if __name__ == "__main__":
    main()