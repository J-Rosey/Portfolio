import random

"""*
* JP_Practice.py
* Author: Jeffrey Rose
* Date: Nov-06-2024
* Description: To give random hiragana/katakana to practice drawing
*"""

# Dictionary for hiragana
hiragana = {
        "a": "あ", "i": "い", "u": "う", "e": "え", "o": "お",
        "ka": "か", "ki": "き", "ku": "く", "ke": "け", "ko": "こ",
        "sa": "さ", "shi": "し", "su": "す", "se": "せ", "so": "そ",
        "ta": "た", "chi": "ち", "tsu": "つ", "te": "て", "to": "と",
        "na": "な", "ni": "に", "nu": "ぬ", "ne": "ね", "no": "の",
        "ha": "は", "hi": "ひ", "fu": "ふ", "he": "へ", "ho": "ほ",
        "ma": "ま", "mi": "み", "mu": "む", "me": "め", "mo": "も",
        "ra": "ら", "ri": "り", "ru": "る", "re": "れ", "ro": "ろ",
        "ya": "や", "yu": "ゆ", "yo": "よ", "wa": "わ", "wo": "を", "n": "ん"
            }

# Dictionary for katakana
katakana = {
        "a": "ア", "i": "イ", "u": "ウ", "e": "エ", "o": "オ",
        "ka": "カ", "ki": "キ", "ku": "ク", "ke": "ケ", "ko": "コ",
        "sa": "サ", "shi": "シ", "su": "ス", "se": "セ", "so": "ソ",
        "ta": "タ", "chi": "チ", "tsu": "ツ", "te": "テ", "to": "ト",
        "na": "ナ", "ni": "ニ", "nu": "ヌ", "ne": "ネ", "no": "ノ",
        "ha": "ハ", "hi": "ヒ", "fu": "フ", "he": "ヘ", "ho": "ホ",
        "ma": "マ", "mi": "ミ", "mu": "ム", "me": "メ", "mo": "モ",
        "ra": "ラ", "ri": "リ", "ru": "ル", "re": "レ", "ro": "ロ",
        "ya": "ヤ", "yu": "ユ", "yo": "ヨ", "wa": "ワ", "wo": "ヲ", "n": "ン"
            }

# Defining the main function
def main():
    # Calls userInput function, writes results to variables choice and num
    choice, num = userInput()
        
    # Takes keys from dictonary and write it to a list
    listKeys = list(choice.keys())
    # Takes a random selection of keys with no duplicates
    randKeys = random.sample(listKeys, num)

    # Uses a loop to print keys to screen, user input (enter) progresses through loop
    print('\nPress "Enter" when you are done drawing.')
    for x in range(1, num + 1):
        y = randKeys[x - 1] # List/dict indexes start at 0, so x needs to be decremented by 1
        input(f"{x}. Draw {y}.")

    print("\nAnswers:")
    # Prints answers
    for x in range(1, num + 1):
        y = randKeys[x - 1]
        print(f"{x}. {y}: {choice[y]}")
        

# Defining the userInput function
def userInput():
    while True:
        sel = input("Would you like to practice hiragana or katakana?\n").lower() # .lower() sets input to lowercase
        if sel == "hiragana" or sel == "hira" or sel == "h":
            choice = hiragana # choice is set to hiragana
            break
        elif sel == "katakana" or sel == "kata" or sel == "k":
            choice = katakana # choice is set to katakana
            break
        else:
            print("Invalid input detected. Please enter either hiragana or katakana.\n")
    
    while True:
        userIn = input("How many letters would you like to practice? (1-46)\n")
        if userIn.isdigit():
            num = int(userIn) # If user input in a number, set it from a string to an int
            if 1 <= num <= 46:
                break # Break the loop and allow the program to continue
            else:
                print("Please enter a number between 1 and 46.\n")
        else:
            print("Invalid input detected. Please enter a number between 1 and 46.\n")
    return choice, num # Returns the values in choice and num to main()


# --Program starts here--
print("--=Hiragana/Katakana Writing Practice=--\n")

# Program loops indefinitely until broken out of via 'break'
while True: 
    main() # Main is called
    
    andAgain = input("\nWould you like to continue? (y/n): ").lower() # .lower() sets input to lowercase
    
    if andAgain != "y": # If anything other than 'y' is selected...
        break           # ...loop breaks and program ends
    
    print("") # Adds a newline, same as \n
print("\nGoodbye.")
