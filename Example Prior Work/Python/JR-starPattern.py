# Title: Star Pattern
# Author: Jeffrey Rose
# Date: Nov-26-2023
# Filename: JR-starPattern.py
# Purpose: Takes a given number and makes an appropriately sized pattern of stars


num = int(input("Pick a number between 1-10: "))
if num < 1 or num > 10:
    print("This is a very serious program. Please take this seriously.")
    exit()

num = num + 1
star = "*"

print("\n  ---Square Pattern---\n")
for i in range(1, num):
    for i in range(1, num):
        print(star, end=' ')
    print()

print("\n  ---Triangle Pattern---\n")
triNum = int(num/num + 1)
for i in range(1, num):
    for i in range(1, triNum):
        print(star, end=' ')
    print()
    triNum += 1
