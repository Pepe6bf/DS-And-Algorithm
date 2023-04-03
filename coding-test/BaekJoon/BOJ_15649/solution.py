import sys

input = sys.stdin.readline
print = sys.stdout.write

N, M = map(int, input().split())

selected = [0 for _ in range(M)]
used = [0 for _ in range(N + 1)]

def recur_func(k):
    global N, M, result

    # base condition
    if k == M:
        for n in selected:
            print(str(n) + " ")
        print("\n")

        return
    
    # recursion logic
    for cand in range(1, N + 1):
        if used[cand] == 1:
            continue

        selected[k] = cand
        used[cand] = 1

        recur_func(k + 1)

        used[cand] = 0

recur_func(0)