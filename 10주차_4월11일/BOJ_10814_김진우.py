n = int(input())
member = []

for i in range(n):
    age, name = map(str, input().split())
    age = int(age)
    member.append((age, name))

print(member)

member.sort(key = lambda x : x[0])	# (age, name)에서 age만 비교

print(member)

for i in member:
    print(i[0], i[1])