class SList: # SList 클래스 선언
    class Node: # Node 클래스 선언
        def __init__(self, item, link): # 초기화 함수 선언
            self.item = item # 노드 생성 노드에 저장할 데이터
            self.next = link # 다음 노드를 가리키는 주소

    def __init__(self): # 초기화 함수 선언
        self.head = None # 첫번째 노드를 가리킴
        self.size = 0 # 리스트의 크기

    def size(self): # 리스트 크기를 반환
        return self.size

    def is_empty(self): # 리스트가 비어있는지 확인
        return self.size == 0

    def insert_front(self, item): # 리스트 맨 앞에 노드를 추가
        if self.is_empty(): # 만약 리스트가 비어있다면
            self.head = self.Node(item, None) # 새 노드를 head로 지정
        else: # 리스트가 차있다면
            self.head = self.Node(item, self.head) # 새 노드를 head로 지정하고 원래 있던 노드를 다음 노드를 지정
        self.size += 1 # 리스트 크기를 1 증가

    def insert_after(self, item, p): # 지정한 노드 뒤에 새로운 노드 삽입
        p.next = self.Node(item, p.next) # p 다음에 새로운 노드 삽입
        self.size += 1 # 리스트 크기를 1 증가

    def delete_front(self): # 리스트 맨 앞에 노드 삭제
        if self.is_empty(): # 리스트가 비어 있다면
            print("리스트가 empty라서 삭제 불가")
        else: # 리스트가 차있다면
            self.head = self.head.next # head를 다음 노드로 이동
            self.size -= 1 # 리스트 크기를 1 감소

    def delete_after(self, p): # 지정한 노드 뒤에 노드 삭제
        if self.is_empty(): # 리스트가 비어 있다면
            print("리스트가 empty라서 삭제 불가")
        t = p.next # 삭제할 노드를 t에다가 저장
        p.next = t.next # 삭제할 노드 다음 노드를 p의 다음 노드로 연결
        self.size -= 1 # 리스트 크기를 1 감소

    def search(self, target): # 노드의 인덱스를 반환
        p = self.head # head를 p에 저장
        for k in range(self.size): # 리스트 크기만큼 반복
            if target == p.item: # 노드를 찾으면
                return k # 인덱스를 리턴
            p = p.next # 다음 노드로 이동
        return None # 못찾으면 None 리턴

    def print_list(self): # 리스트 출력
        p = self.head # 첫 노드 p에 저장
        while p: # p가 None이 될때까지 반복
            if p.next is not None: # p다음 노드가 있다면
                print(p.item, " -> ", end=' ') # 노드 출력, 화살표 출력, 줄 바꾸지 않음
            else: # 다음 노드가 없다면
                print(p.item) # 노드 출력
            p = p.next # 다음 노드로 이동

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