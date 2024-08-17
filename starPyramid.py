def pattern(N):
    for i in range(N, 0, -1):
        print((2*i+1) * "*", end="")
        
        print((N-i-1) * " ")

        print((N-i-1) * " ", end="")

if __name__ == "__main__":
    seekNum = int(input("Enter a number for Pyramid size : "))

    pattern(seekNum)

    