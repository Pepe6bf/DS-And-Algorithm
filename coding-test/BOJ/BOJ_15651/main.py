import sys

input = sys.stdin.readline
print = sys.stdout.write

N, M = map(int, input().split())
selected = [0 for _ in range(M)]

def recur_func(k):
    # base condition
    if k == M:
        for n in selected:
            print(str(n) + " ")
        print("\n")

        return
    
    # recursion logic
    for cand in range(1, N + 1):
        selected[k] = cand
        recur_func(k + 1)

recur_func(0)