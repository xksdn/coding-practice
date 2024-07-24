class DList:
    class Node:
        def __init__(self, item, prev, link):  # 노드 생성자
            self.item = item  # 노드가 가지고 있는 데이터
            self.prev = prev  # 이전 노드를 가리키는 포인터
            self.next = link  # 다음 노드를 가리키는 포인터

    def __init__(self):  # 이중 연결 리스트 생성자
        self.head = self.Node(None, None, None)  # 머리 노드
        self.tail = self.Node(None, self.head, None)  # 꼬리 노드
        self.head.next = self.tail  # 머리 노드의 다음 노드를 꼬리 노드로 설정
        self.size = 0  # 리스트의 항목 수

    def size(self): return self.size  # 리스트의 항목 수 반환

    def is_empty(self): return self.size == 0  # 리스트가 비어있는지 확인

    def insert_before(self, p, item):  # p 앞에 삽입
        t = p.prev  # p의 이전 노드
        n = self.Node(item, t, p)  # 새로운 노드 생성
        p.prev = n  # p의 이전 노드를 새로운 노드로 변경
        t.next = n  # 이전 노드의 다음 노드를 새로운 노드로 변경
        self.size += 1  # 리스트의 항목 수 증가

    def insert_after(self, p, item):  # p 다음에 삽입
        t = p.next  # p의 다음 노드
        n = self.Node(item, p, t)  # 새로운 노드 생성
        t.prev = n  # 다음 노드의 이전 노드를 새로운 노드로 변경
        p.next = n  # p의 다음 노드를 새로운 노드로 변경
        self.size += 1  # 리스트의 항목 수 증가

    def delete(self, x):  # x가 참조하는 노드 삭제
        f = x.prev  # 삭제할 노드의 이전 노드
        r = x.next  # 삭제할 노드의 다음 노드
        f.next = r  # 이전 노드의 다음 노드를 삭제할 노드의 다음 노드로 변경
        r.prev = f  # 다음 노드의 이전 노드를 삭제할 노드의 이전 노드로 변경
        self.size -= 1  # 리스트의 항목 수 감소
        return x.item  # 삭제한 노드의 데이터 반환

    def print_list(self):  # 리스트 출력
        if self.is_empty():
            print('리스트 비어있음')
        else:
            p = self.head.next
            while p != self.tail:
                if p.next != self.tail:
                    print(p.item, ' <=> ', end='')
                else:
                    print(p.item)
                p = p.next

    def reverse_print(self):
        if self.is_empty():
            print("리스트 없음")
        else:
            p = self.tail.prev
            while p != self.head:
                if p.prev != self.head:
                    print(p.item, " - ", end='')
                else:
                    print(p.item)
                p = p.prev


class EmptyError(Exception):  # underflow 시 에러 처리
    pass


s = DList()
s.insert_after(s.head, 'A')
s.insert_before(s.tail, 'B')
s.insert_before(s.tail, 'C')
s.insert_after(s.head.next, 'D')
s.print_list()
s.reverse_print()
print('마지막 노드 삭제 후:\t', end='')
s.delete(s.tail.prev)
s.print_list()
print('맨 끝에 포도 삽입 후:\t', end='')
s.insert_before(s.tail, 'grape')
s.print_list()
print('첫 노드 삭제 후:\t', end='')
s.delete(s.head.next)
s.print_list()
print('첫 노드 삭제 후:\t', end='')
s.delete(s.head.next)
s.print_list()
print('첫 노드 삭제 후:\t', end='')
s.delete(s.head.next)
s.print_list()
print('첫 노드 삭제 후:\t', end='')
s.delete(s.head.next)
s.print_list()
