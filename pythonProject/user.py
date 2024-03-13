class User:

    def __init__(self, name, email, password):
        self.name = name
        self.email = email
        self.password = password

    def say_hello(self):
        print(f"안녕하세요 저는 {self.name}입니다.")

    def login(self, email, password):
        if self.email == email and self.password == password:
            print("로그인 성공, 환영합니다.")
            self.say_hello()
        else:
            print("로그인 실패, 없는 아이디이거나 잘못된 비밀번호입니다.")


user1 = User("강탄우", "tanwoo3327@naver.com", "12345")

print(user1.name, user1.email, user1.password)
