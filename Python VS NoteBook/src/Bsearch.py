from typing import Any, Sequence

class Bsearch :
    def bin_search(a: Sequence, key: Any) -> int :
        pl = 0
        pr = len(a)-1

        while (True) :
            pc = ((pl+pr) // 2)
            
            if (a[pc] < key) :
                pl = pc + 1
            elif (a[pc] > key) :
                pr = pc - 1
            else :
                return pc
            
            if (pl > pr) :
                break

        return -1