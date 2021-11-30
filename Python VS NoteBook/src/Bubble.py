from typing import Any, MutableSequence


class Bubble :
    def bubble(a: MutableSequence) -> MutableSequence :
        n = len(a)
        ex = 0
        k = 0

        while (k < n-1) :
            last = n-1

            for i in range(n-1, k, -1) :
                if (a[j-1] > a[j]) :
                    a[j-1], a[j] = a[j], a[j-1]
                    last = j

            k = last


    def shaker(a: MutableSequence) -> MutableSequence :
        left = 0
        right = len(a) - 1
        last = right

        while (left < right) :
            for i in range(right, left, -1) :
                if (a[i-1] > a[i]) :
                    a[i-1], a[i] = a[i], a[i-1]
                    last = i

            left = last

            for i in range(left, right, 1) :
                if (a[i] > a[i+1]) :
                    a[i], a[i+1] = a[i+1], a[i]
                    last = i

            right = last


    def straight(a: MutableSequence) -> MutableSequence :
        n = len(a)

        for i in range(0, n-1) :
            min = i

            for j in range(i+1, n) :
                if (a[min] > a[j]) :
                    min = j
            a[i], a[min] = a[min], a[i]

        
    def insertion(a: MutableSequence) -> MutableSequence :
        n = len(a)

        for i in range(1, n) :
            j = i
            tmp = a[i]

            while j > 0 and a[j-1] > tmp :
                a[j] = a[j-1]
                j -= 1

            a[j] = tmp



    def biInsertion(a: MutableSequence) -> MutableSequence :
        n = len(a)

        for i in range(1, n) :
            key = a[i]
            pl = 0
            pr = i-1

            while True :
                pc = (pl + pr) // 2

                if (a[pc] == key) :
                    break

                elif (a[pc] < key) :
                    pl = pc + 1

                else :
                    pr = pc - 1

                if (pl > pr) :
                    break

            pd = pc + 1 if (pl <= pr) else pr + 1

            for j in range(i, pd, -1) : 
                a[j] = a[j-1]
            a[pd] = key



if __name__ == "__main__" :
    print(Bubble.bubble([6, 4, 3, 7, 1, 9, 8]))