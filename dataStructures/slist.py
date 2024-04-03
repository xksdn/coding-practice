class SList:
    class Node:
        def __init__(self, item, link):
            self.item = item
            self.next = link

    def __init__(self):
        self.head = None
        self.size = 0

    def size(self):
        return self.size

    def is_empty(self):
        return self.size == 0

    def insert_front(self, item):
        if self.is_empty():
            self.head = self.Node(item, None)
        else:
            self.head = self.Node(item, self.head)
        self.size += 1

    def insert_after(self, item, p):
        p.next = self.Node(item, p.next)
        self.size += 1

    def delete_front(self):
        if self.is_empty():
            print("리스트가 empty라서 삭제 불가")
        else:
            self.head = self.head.next
            self.size -= 1

    def delete_after(self, p):
        if self.is_empty():
            print("리스트가 empty라서 삭제 불가")
        t = p.next
        p.next = t.next
        self.size -= 1

    def search(self, target):
        p = self.head
        for k in range(self.size):
            if target == p.item:
                return k
            p = p.next
        return None

    def print_list(self):
        p = self.head
        while p:
            if p.next is not None:
                print(p.item, " -> ", end=' ')
            else:
                print(p.item)
            p = p.next

s = SList()
s.insert_front("A")
s.insert_front("B")
s.insert_front("C")
s.insert_after("C", s.head.next)
s.print_list()
s.delete_after(s.head)
s.print_list()
s.delete_front()
s.print_list()

print(s.search("A"))