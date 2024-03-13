with open('chicken.txt', 'r', encoding='UTF-8') as f:
    total_revenue = 0 # 총 매출
    total_days = 0 # 총 일수

    for line in f:
        date = line.strip().split(": ") # 데이터를 가공 처리
        revenue = int(date[1]) # 1번째 데이터부터 저장

        total_revenue += revenue
        total_days += 1

    print(total_revenue / total_days)