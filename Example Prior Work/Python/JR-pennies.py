# Title: Pennies for Pay
# Author: Jeffrey Rose
# Date: Nov-26-2023
# Filename: JR-pennies.py
# Purpose: Calculates the money you would earn if you doubled your money each day, starting from a single penny


daysInt = int(input("Insert number of days: "))
dayCount = 0
money = float(0.01)
multiMoney = money
totalMoney = float(0.01)

print(" Days\tMoney")
print("--------------")

for money in range(daysInt):
    dayCount += 1
    if dayCount == 1:
        money = float(0.01)
    else:
        money = multiMoney * 2
        multiMoney = money
        totalMoney += money
    print('', dayCount, '\t' + '$' + str(money))

print("----------------")
print("Total money earned is: $" + str(round(totalMoney, 2)))
