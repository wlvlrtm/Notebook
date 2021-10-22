from Median3 import *
from Sum2n import *
from AlterPM import *
from typing import Any
from MaxOf import *
from CardConv import *
from Prime import *
from Bsearch import *


"""
## med3() 
def med3(a: int, b: int, c: int) -> None :
	a, b, c: max num
		return middle number
		
	if (a != 1 or b != 1 or c != 1) :       ## End Point; a, b, c all rotated
		if (b == 1 and c == 1) :            ## a -=1; b, c all rotated  || (for ai in range(1, 4))
			med3(a-1, 3, 3)
		elif (c == 1) :                     ## b -= 1; c all rotated    || (for bi in range(1, 4))
			med3(a, b-1, 3)
		else :                              ## c -= 1; c ratate         || (for ci in range(1, 4))
			med3(a, b, c-1)
	
	print(f"a: {a}, b: {b}, c: {c}")
	print(cmp(a, b, c))
"""
 

## Main()
def Main() -> None :

	print(Median3.med3v2(5, 3, 2))
	print(Sum2n.sum_While(5))
	print(Sum2n.sum_for(10))
	print(Sum2n.sum_G(100))
	print(Sum2n.sum_a2b(1, 1))
	print(Sum2n.sum_a2b(5, 1))
	
	print()

	AlterPM.alternative(19)
	AlterPM.printStars(14, 5)


	a: int = 1
	b: int = 100
	sum: int = 0

	for i in range(a, b+1, 1):
		sum += i
	print(sum)

	n: int = 17
	print("+-" * (n//2), end="")
	if (n % 2) :
		print("+")

	n: int = 15
	m: int = 5

	for _ in range(1, (n//m)+1):
		print("*" * m)
	print("*" * (n%m))

	x = (1, 2, 3)
	print(x[0])

	print(x[-3])

	s = [1, 2, 9.7, 4, 5, 6, 7]
	print(s[-1])


	a = [1, 2]
	b = a

	c = [1, 2]

	print(a is b)
	print(a is c)

	s.reverse()
	print(s)

	print(MaxOf.max(s))
	print()

	print(CardConv.cardConv(59, 16))
	print()

	Prime.prime1()
	print()
	Prime.prime2()
	print()
	Prime.prime3()

	arr = [1, 2, 3, 4, 5]

	d = 3
	for i in arr:
		if (i == d) :
			print(i)
			break

	print()

	num = 0
	s = []

	while True :
		n = input(f"x[{num}]: ")
		if (n == 'End') :
			break
		s.append(float(n))
		num += 1

	print()

	x = [1, 2, 3, 4, 5]
	ky = 3
	print(Bsearch.bin_search(x, ky))




	pass








if (__name__ == "__main__"):
    Main()