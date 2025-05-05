# 문제명: 나선형 배열 채우기 (Spiral Matrix)
# 문제 설명 요약:
# - 양의 정수 n이 주어졌을 때,
#   1부터 n^2까지의 수를 n x n 배열에 시계방향으로 나선형으로 채운 이차원 배열을 반환.
# - 채우는 순서는 [0][0]부터 시작해 → ↓ ← ↑ 방향으로 반복하면서 채운다.

def solution(n):
    # n x n 크기의 2차원 배열을 0으로 초기화
    answer = [[0] * n for _ in range(n)]

    # 방향 (상, 우, 하, 좌)
    directions = [(-1, 0), (0, 1), (1, 0), (0, -1)]

    # 현재 위치
    x, y = 0, 0
    current_direction = 1  # 처음에는 '우' 방향으로 시작
    num = 1  # 1부터 시작해서 n^2까지 채운다.

    while num <= n * n:
        answer[x][y] = num  # 현재 칸에 숫자 배치
        num += 1  # 다음 숫자

        # 다음 칸으로 이동
        next_x, next_y = x + directions[current_direction][0], y + directions[current_direction][1]

        # 경계 확인 및 방향 변경
        if not (0 <= next_x < n and 0 <= next_y < n and answer[next_x][next_y] == 0):
            # 경계를 벗어나거나 이미 채운 칸이 있으면 방향을 바꿔야 함
            current_direction = (current_direction + 1) % 4  # 방향을 시계방향으로 변경
            next_x, next_y = x + directions[current_direction][0], y + directions[current_direction][1]

        # 다음 칸으로 이동
        x, y = next_x, next_y

    return answer
