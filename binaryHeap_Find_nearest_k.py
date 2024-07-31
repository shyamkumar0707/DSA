from heapq import heappop, heappush
from math import sqrt
from typing import List

def k_closest_points(points: List[List[int]], k: int) -> List[List[int]]:
    heap = []

    for pt in points:
        heappush(heap, (pt[0] ** 2 + pt[1] ** 2, pt))

    res = []
    for _ in range(k):
        _, pt = heappop(heap)
        res.append(pt)

    return res

if __name__ == '__main__':
    points = [[int(x) for x in input().split()] for _ in range(int(input()))]
    k = int(input())
    res = k_closest_points(points, k)
    for row in res:
        print(' '.join(map(str, row)))