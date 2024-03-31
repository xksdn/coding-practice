class User:
    def __init__(self, name, email, password):
        self.name = name
        self.email = email
        self.password = password

    @classmethod
    def from_string(cls, string_params):
        # 각 변수에 분리된 문자열 저장
        params_list = string_params.split(",")
        # 인스턴스 생성 후 리턴
        return cls.from_list(params_list)

    @classmethod
    def from_list(cls, list_params):
        # 인스턴스 생성 후 리턴
        return cls(list_params[0], list_params[1], list_params[2])


# 유저 생성 및 초기값 설정
younghoon = User.from_string("강영훈,younghoon@codeit.kr,123456")
yoonsoo = User.from_list(["이윤수", "yoonsoo@codeit.kr", "abcdef"])

print(younghoon.name, younghoon.email, younghoon.password)
print(yoonsoo.name, yoonsoo.email, yoonsoo.password)