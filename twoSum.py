from typing import List

class solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        index_map = {}

        for index, number in enumerate(nums):
            complement = target - number
            if complement in index_map:
                return [index_map[complement], index]
            index_map[number] = index

print(solution.twoSum(0,[2,7,11,15],9))