from typing import Any

class Food :
    totalCalorie = 0

    def __init__(self, name, cal) :
        self.name = name                ## Food Name
        self.cal = cal                  ## Food Cal
        Food.totalCalorie += self.cal   ## Food Total Cal


    def decide(self) -> int :
        """ Is Food over 800kcal? """

        return 1 if (self.cal >= 800) else 0


    def print(self) -> None :
        """ Print info. about Food's Kcal """

        if (Food.decide(self) == 1) :   ## High kcal
            print("고칼로리 식품")
        else :                      ## Low kcal
            print("저칼로리 식품")


    def getTotalCalorie() -> int :
        """ Return the Total Calorie Info. """

        return Food.totalCalorie



if __name__ == "__main__" :
    food1 = Food("볶음밥", 1000)
    food2 = Food("햄버거", 700)
    food3 = Food("라면", 500)

    food_set = [food1, food2, food3]

    for i in food_set :
        print(i.name + ": " + str(i.cal) + " Kcal " , end="")
        i.print()
        
    print("총 열량: " + str(Food.getTotalCalorie()) + " Kcal")