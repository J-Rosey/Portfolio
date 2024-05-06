# Title: rightTriangle
# Author: Jeffrey Rose
# Date: Oct-25-2023
# Filename: JR-rightTriangle.py
# Purpose: Checks if a triangle is a right-angled triangle based on the provided length of its sides

print("\t---right_Triangle_Checker.exe---")

longSide = float(input('Insert "longest_Side": '))
sideA = float(input('Insert "side_A": '))
sideB = float(input('Insert "side_B": '))

# Check if longSide**2 equals sideA**2 + sideB**2 and print the result
print('"is_Right_Triangle" = ' + str(sideA**2 + sideB**2 == longSide**2))
