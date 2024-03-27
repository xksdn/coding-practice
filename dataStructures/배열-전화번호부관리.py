'''순차자료구조 배열을 이용한 전화번호부관리 프로그램 22.04.07
기능: 입력,수정,삭제, 출력, 종료
성명을 키로 찾아 수정,삭제작업함
2020136019 강탄우
class를 사용한 객체지향방식으로 코딩
'''
class Phonebook:
    def __init__(self):
        self.PhoneBook = []

# 중복체크후 신규인  추가
    def add_new_user(self, name, phone):
        if self.find_user(name)!= None:
            print("이미 저장된 이름입니다")
            return
        self.PhoneBook.append([name,phone])

#특정인 위치 찾기    
    def find_user(self, name):
        count = 0
        position = None
        for i in self.PhoneBook:
            if(i[0] == name):
                position = count
                break
            else:
                count = count + 1
        return position

# 이름으로 검색하여 전화번호 수정    
    def edit_user_info(self, name):
        position = None
    
        position = self.find_user(name)
        if(position == None):
            print("해당 정보가 존재하지 않습니다.")
            return
        edit_value = input("수정할 전화번호 입력  : ")
        self.PhoneBook[position][1] = edit_value

#특정인 삭제    
    def delete_user(self, name):
        position = None
    
        position = self.find_user(name)
        if(position == None):
            print("해당 정보가 존재하지 않습니다.")
            return
        del(self.PhoneBook[position])

#전체 전화번호 출력
    def print_all_phone(self):
        print("*"*10, "전화번호부", "*"*10)
        for i in self.PhoneBook:
            print("이름: %5s   전화번호:%5s" %(i[0], i[1]))
        print("*"*32)

def main():
    phonebook = Phonebook()
    while True:
        choice = input("사용자 추가(n), 수정(e), 삭제(d), 전체 출력(p), 종료(q) : ")

        if (choice == 'n'):
            name = input("이름: ")
            phone = input("전화번호 : ")
            phonebook.add_new_user(name, phone)

        elif (choice == 'e'):
            name = input("수정할 사용자의 이름을 입력하세요 : ")
            phonebook.edit_user_info(name)

        elif (choice == 'd'):
            name = input("삭제할 사용자의 이름을 입력하세요 : ")
            phonebook.delete_user(name)

        elif (choice == 'p'):
            phonebook.print_all_phone()

        elif (choice == 'q'):
            print("\n프로그램을 종료합니다.")
            break
        else:
            print("다시 입력하세요")



#main part
if __name__ == '__main__':
        main()
