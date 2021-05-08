class Shape:
  def __init__(self, x, y):
    self.x = x
    self.y = y

  def area(self):
    print("계산할 수 없음!")

  def perimeter(self):
    print("계산할 수 없음!")


class Rectangle(Shape):
  def __init__(self, x, y, width, height):
    super().__init__(x, y)
    self.width = width
    self.height = height

  def area(self):
    return self.width * self.height

  def perimeter(self):
    return 2 * (self.width + self.height)

r = Rectangle(0, 0, 100, 200)
test = Shape(1, 2)

print("사각형의 면적", r.area())
print("사각형의 둘레", r.perimeter())

test.area()