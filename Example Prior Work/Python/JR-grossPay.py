# Title: grossPay
# Author: Jeffrey Rose
# Date: Oct-24-2023
# Filename: JR-grossPay.py
# Purpose: Takes your hourly rate, hours worked, and overtime hours to calculate gross pay

print("\t---Gross Pay Calculator---")

wage = float((input("Enter your hourly wage: ")))
workHrs = float((input("Enter the amount of hours you worked this week (do not include overtime): ")))
overHrs = float((input("Enter the amount of overtime hours worked this week (if none, then enter 0): ")))

# Take wage and multiply by workHrs to get totalWage
totalWage = wage * workHrs
# Get overWage by taking overHrs and multiplying by (wage * 1.5)
overWage = overHrs * (wage * 1.5)
# Add totalWage and overWage to get grossWage
grossWage = totalWage + overWage

print("Excluding overtime, the amount of money you earned this week is: $" + str(totalWage) + ".")
print("The amount of money earned from overtime this week is: $" + str(overWage) + ".")
print("The total gross pay you earned this week is: $" + str(grossWage) + ".")
