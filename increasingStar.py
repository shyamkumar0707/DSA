starSize = int(input("Enter size of Increasing Star pattern : "))

for i in range(starSize):
    
    for j in range(i):
        print(j+1, end="  ")
    print("")
    