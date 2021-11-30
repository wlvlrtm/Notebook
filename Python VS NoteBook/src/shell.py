from typing import Any, MutableSequence

class shell :
    def shellSort(a: MutableSequence) -> MutableSequence :
        n = len(a)
        h = n // 2


        while h < n // 9 :
            h = 3 * h + 1

            while h > 0 :
                for i in range(h, n) :
                    j = i - h
                    tmp = a[i]

                    while j >= 0 and a[j] > tmp :
                        a[j + h] = a[j]
                        j -= h

                    a[j + h] = tmp

                h //= 3

            
