class PhoneBook:
    def __init__(self):
        self.Phonebook = []

    def find_user(self, name):
        count = 0
        position = None
        for i in self.Phonebook:
            if i[0] == name:
                position = count
                break
            else:
                count += 1
            return position

    def add_new_user(self, name, phone):
        if self.find_user(name) != None:
            print("이미 있음")
            return
        self.Phonebook.append([name, phone])

    def edit_user_info(self, name):
        position = self.find_user(name)
        if position == None:
            print("없는 사람입니다.")
            return
        edit = input("전화번호 :")
        self.Phonebook[position][1] = edit

    def print_all_phone(self):
        for i in self.Phonebook:
            print(i)