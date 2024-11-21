bread = ["호밀빵", "위트", "화이트"]
meat = ["미트볼", "소시지", "닭가슴살"]
vegetable = ["양상추", "토마토", "오이"]
sauce = ["마요네즈", "허니 머스타드", "칠리"]

count = 0
for i in bread:
    for j in meat:
        for k in vegetable:
            for r in sauce:
                print(f"{i}+{j}+{k}+{r}")
                count += 1

print("총 경우의 수:", count)
