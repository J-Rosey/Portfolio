# Title: OH&S Exam Grading Program
# Author: Jeffrey Rose
# Date: Nov-30-2023
# Filename: JR-OH&SGrading.py
# Purpose: Compares answers to a pre-provided answer sheet


# insert test answers and store them in a list
def inAnswer():
    ansList = []
    for i in range(0, 10):
        ans = input("Insert test answers (capitalized) separated by enters: ")
        ansList.append(ans)
    return ansList

# compare test answers with answer list. compare index numbers using bool and append a new list
def compareAnswers(ansSheet, testAns):
    results = []
    for i in range(0,10):
        if testAns[i] == ansSheet[i]:
            results.append(True)
        else:
            results.append(False)
    return results

# read bool list and display pass or fail, how many questions are right and wrong, and which are wrong
def displayResult(testRes):
    x = testRes.count(False)
    y = testRes.count(True)
    print(testRes)
    print(y, "questions have been answered right, and", x, "questions have been answered wrong.")
    if x > 3:
        print("Student has failed.")
    else:
        print("Student has passed.")

def main():
    ansSheet = list("ADCCBADCAB")
    testAns = inAnswer()
    testRes = compareAnswers(ansSheet, testAns)
    displayResult(testRes)

main()