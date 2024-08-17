# from typing import List

# class solution:
#     def twoSum(self, nums, target):
#         index_map = {}

#         for index, number in enumerate(nums):
#             complement = target - number
#             if complement in index_map:
#                 return [index_map[complement], index]
#             index_map[number] = index

# print(solution.twoSum(0,[1,9,3,6],9))

# from typing import List #import List from typing
# class twoSumSol:   #define class

#     def twoSum(self, num, target): #define the function
#         hash_table = {} # set the dictionary to empty object
#         for number, index in enumerate(num): #iterate the array and pick track the index with the iterable value
#             complement = target - number # result value for closing down on target
#             if complement in hash_table: # once paced into dictionary read from it
#                 return [hash_table[complement], index] #return the index values
#             hash_table[number] = index #assign the index value to the number in the dictionary

# print(twoSumSol.twoSum(0, [0,1,2,3,4,5,6], 3)) #call the function

from typing import List

class sumTwo:
        def checkNearestK(self, num, target):
            hash_map = {}
            for number, index in enumerate(num):
                complement = target - number
                if complement in hash_map:
                     return [hash_map[complement], index]
                hash_map[number] = index

print(sumTwo.checkNearestK(0, [0,1,2,3,4,5], 3))