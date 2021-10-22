# 1 to n int num add


class Sum2n :
    def sum_While(num: int) -> int :
        s: int = 0
        i: int = 1

        while (i <= num) :
            s += i
            i+= 1

        return s
    
    def sum_for(num: int) -> int :
        s: int = 0

        for i in range(1, num+1) :
            s += i

        return s


    def sum_G(num: int) -> int :
        return int((num + 1) * (0.5 * num))


    def sum_a2b(numA: int, numB: int) -> int :
        s: int = 0

        if (numA > numB) :
            numA, numB = numB, numA

        for i in range(numA, numB+1) :
            s += i
            if (i < numB) :
                print(f"{i} + ", end="")
            else :
                print(f"{i} = ", end="")
        
        return s
