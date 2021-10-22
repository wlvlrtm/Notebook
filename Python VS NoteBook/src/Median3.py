from typing import Any

class Median3 :
	def med3v1(a: int, b: int, c: int) -> int :
		""" a, b, c: num1, num2, num3
			return: middle num """

		if (a >= b) :
			if (b >= c) :
				## a >= b >= c
				return b
			elif (c >= a) :
				## c >= a >= b
				return a
			else :
				## a >= c >= b
				return c
		elif (c > b) :
			## c > b > a
			return b
		elif (a > c) :
			## b > a > c
			return a
		else :
			## b > c > a
			return c


	def med3v2(a: int, b: int, c: int) -> int :
		""" return middle num; V2 """
	
		if (b >= a and a >= c) or (c >= a and a >= b) :
			return a
		elif (b > c and c > a) or (a > c and c > b) :
			return c
		return b