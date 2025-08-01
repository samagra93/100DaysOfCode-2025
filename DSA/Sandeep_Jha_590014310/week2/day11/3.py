def count_palin_sub(s):
    n = len(s)
    count = 0
    def expand(left, right):
        nonlocal count
        while left >= 0 and right < n and s[left] == s[right]:
            count += 1
            left -= 1
            right += 1
    for i in range(n):
        expand(i, i)
        expand(i, i+1)
    return count

print(count_palin_sub(s=input("enter your word: ")))