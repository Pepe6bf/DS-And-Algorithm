# 입력 값 = 1260
# 출력 값 = 6

coins = [500, 100, 50, 10]
count = 0

n = int(input())

for coin in coins:
    count += n // coin
    n %= coin

print(count)
