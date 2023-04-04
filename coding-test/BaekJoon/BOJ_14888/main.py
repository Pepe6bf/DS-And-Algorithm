import sys

input = sys.stdin.readline

N = int(input())
nums = list(map(int, input().split()))
operators = list(map(int, input().split()))
min = 1e9
max = -1e9

def calculator(operand1, operate, operand2):
    if operate == 0:
        return operand1 + operand2
    if operate == 1:
        return operand1 - operand2
    if operate == 2:
        return operand1 * operand2
    if operate == 3:
        if operand1 < 0:
            return -((-operand1) // operand2)
        else:
            return operand1 // operand2
    

def rec_func(k, value):
    # base case
    if k == N - 1:
        global min, max
        min = min if min < value else value
        max = max if max > value else value

        return
    
    # recursion logic
    for cand in range(4):
        if operators[cand] >= 1:
            operators[cand] -= 1
            rec_func(k + 1, calculator(value, cand, nums[k + 1]))
            operators[cand] += 1

rec_func(0, nums[0])
print(max)
print(min)