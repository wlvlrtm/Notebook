from typing import MutableSequence

class Quick :
    def qsort(a: MutableSequence, left: int, right: int) -> None :
        n = len(a)                      ## Len of list a
        x = a[(left + right) // 2]      ## Pivot
        pl = left                       ## Left pointer
        pr = right                      ## Right pointer
        


        while (pl < pr) :
            while (a[pl] < a[x]) :
                pl += 1

            while (a[pr] > a[x]) :
                pr -= 1

            if (pl <= pr) :     ## a[pl] > a[x] && a[pr] < a[x]
                a[pl], a[pr] = a[pr], a[pl]
                pl += 1
                pr -= 1


        if (left < pr) : 
            Quick.qsort(a, left, pr)

        if (right > pl) :
            Quick.qsort(a, pl, right)


    def quickSort(a: MutableSequence) -> None :
        qsort(a, 0, len(a)-1)

