target = int(input("Enter a number " ))

for i in range(target):
    for j in range(target, i, -1):
        print(target-j+1, end="  ")
    print("")