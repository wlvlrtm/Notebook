from typing import Any, Sequence

class MaxOf :
    def max(a: Sequence) -> Any:
        """ return a max num of Sequence a """

        maximum: int = a[0]

        for i in range(1, len(a)) :
            if (a[i] > maximum) :
                maximum = a[i]

        return maximum