# 문제명: 조카의 발음 가능 단어 세기
# 문제 설명 요약:
# 머쓱이의 6개월 된 조카는 "aya", "ye", "woo", "ma" 네 가지 발음만 할 수 있고,
# 이 발음들을 한 번씩만 조합하여 하나의 단어처럼 말할 수 있다.
# 주어진 문자열 배열 babbling에서 조카가 발음할 수 있는 단어가 몇 개인지 구하는 문제.

#             babbling	                       result
# ["aya", "yee", "u", "maa", "wyeoo"]	         1
# ["ayaye", "uuuma", "ye", "yemawoo", "ayaa"]	 3

def solution(babbling):
    can_speak = ["aya", "ye", "woo", "ma"]
    answer = 0

    for word in babbling:
        for speak in can_speak: # 해당되는 문자를 공백으로 교체
            word = word.replace(speak, " ")
        if word.strip() == "": # 공백 제거 후 문자열이 없다면
            answer += 1

    return answer
