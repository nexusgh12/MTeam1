import heapq

n = int(input())

heap = []
for _ in range(n):
    card = int(input())
    heapq.heappush(heap, card)

print(heapq)


cnt = 0

#heap에 원소가 1개 남을 때까지
while len(heap) != 1:
    # 가작 작은 2개의 카드 묶음 꺼내기
    one = heapq.heappop(heap)
    two = heapq.heappop(heap)

    # 카드 묶음을 합쳐서 다시 삽입
    sum_value = one + two
    cnt += sum_value
    heapq.heappush(heap, sum_value)

print(cnt)