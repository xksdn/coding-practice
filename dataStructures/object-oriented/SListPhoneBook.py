class Phonebook:
    class Node:
        def __init__(self, name, phone):
            self.name = name
            self.phone = phone
            self.next = None

    def __init__(self):
        self.head = None

    # 전화번호 등록
    def add_entry(self, name, phone):
        newNode = self.Node(name, phone)
        if self.search(name) is not None:
            print("이미 있는 전화번호 입니다.")
        else:
            if self.head is None or name < self.head.name:
                newNode.next = self.head
                self.head = newNode
            else:
                current = self.head
                while current.next is not None and name > current.name:
                    current = current.next
                newNode.next = current.next
                current.next = newNode
            print("전화번호가 추가되었습니다.")

    def modify(self, name, phone): # 전화번호 수정
        number = self.search(name)
        if number is None:
            print("없는 전화번호입니다.")
        else:
            number.phone = phone

    def del_tel(self, name): # 전화번호 삭제
        delete_node = self.search(name)
        if delete_node is None:
            print("존재하지 않는 이름입니다.")
            return
        # 삭제할 전화번호가 헤드라면
        if delete_node == self.head:
            self.head = self.head.next
            del delete_node
        else:
            # 삭제할 노드의 전 노드를 찾아서 삭제할 노드의 앞 노드랑 연결
            before = self.head
            while before:
                if before.next == delete_node:
                    before.next = delete_node.next
                before = before.next

    # 전화번호 탐색
    def search(self, target):
        p = self.head
        while p:
            if target == p.name:
                return p
            p = p.next
        return None

    def print_all(self):
        current = self.head
        while current:
            print(current.name, current.phone)
            current = current.next


if __name__ == "__main__":
    phonebook = Phonebook()
    while True:
        choice = input(f"1: 입력, 2:수정, 3:삭제 ,4: 탐색, 5:종료\n")
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
            result = phonebook.search(name)
            if result is None:
                print("없는 번호입니다.")
            else:
                print(result.name, result.phone)
        elif choice == '5':
            print("프로그램을 종료합니다.")
            break
        elif choice == '6':
            phonebook.print_all()
        else:
            print("다시 입력해주세요")