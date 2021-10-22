from typing import Any

class Prime :
    def prime1() -> None:
        counter = 0

        for i in range(2, 1000+1) :
            for j in range(2, i) :
                counter+= 1
                if (i % j == 0) :   ## 나누어서 떨어짐; 소수가 아님
                    break
            else:
                print(i)

        print(f"counter: {counter}")


    def prime2() -> None:
        counter = 0
        st = [2,]

        for i in range(3, 1000+1, 2):
            for j in range(1, len(st)) :
                counter += 1
                if (i % st[j] == 0) :
                    break
            else :
                print(i)
                st.append(i)

        print(f"counter: {counter}")


    def prime3() -> None:
        counter = 0
        st = [2, 3,]

        for i in range(5, 1000+1, 2) :
            j = 1
            while (st[j]*st[j] <= i) :
                counter += 2
                if (i % st[j] == 0) :
                    break
                j += 1
            else :
                counter += 1
                print(i)
                st.append(i)
        print(f"counter: {counter}")

                    


