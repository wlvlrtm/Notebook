class CardConv :
    def cardConv(x: int, r: int) -> str:
        """ int a to r a """
        
        result = ""

        dChr = '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ'

        while (x > 0) :
            result += dChr[x % r]
            x = x // r

        return result[::-1]