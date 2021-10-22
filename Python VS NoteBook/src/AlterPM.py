class AlterPM :
    def alternative(num: int) -> None :
        for _ in range(num // 2) :
            print("+-", end="")

        if (num % 2) :
            print("+", end="")
        print()


    def printStars(num: int, numEnter: int) -> None :
        for _ in range(num // numEnter) :
            print("*" * numEnter)

        rest = (num % numEnter)
        if rest > 0 :
            print("*" * rest)