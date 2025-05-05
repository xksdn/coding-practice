# 문제 설명 요약:
# - 세 개의 기둥(1, 2, 3)과 크기 다른 n개의 원판이 있다.
# - 모든 원판은 1번 기둥에 쌓여 있으며, 이들을 최소 횟수로 3번 기둥으로 옮겨야 한다.
# - 옮길 때는 한 번에 하나의 원판만 이동 가능하고,
#   더 큰 원판이 더 작은 원판 위에 올라갈 수 없다.
# - 이동 경로를 [from, to] 형식의 리스트로 모두 구해 반환한다.

# n	     |              result
# 2	     |      [ [1,2], [1,3], [2,3] ]

def solution(n):
    result = []

    def move(N, start, to, via):
        if N == 1:
            result.append([int(start), int(to)])
        else:
            move(N-1, start, via, to)
            result.append([int(start), int(to)])
            move(N-1, via, to, start)

    move(n, '1', '3', '2')
    return result
