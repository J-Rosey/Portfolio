/**
 * Filename: keywords.c
 * Author: Jeffrey Rose
 * Date: Apr-11-2024
 * Purpose: A menu to display the definition of various C keywords
*/


#include <stdio.h>
#include <ctype.h>

int input;
int sel;
char control = 'Y';

char DT[][90] = {"int: Specifies the integer type of value a variable will hold.", "char: Specifies the character type of value a variable will hold.", "float: Specifies the single-precision floating-point of value a variable will hold.", "double: Specifies the double-precision floating-point type of value a variable will hold."};
char Qu[][82] = {"signed: Specifies a variable can hold positive and negative integer type of data.", "unsigned: Specifies a variable can hold only the positive integer type of data.", "short: Specifies a variable can hold fairly small integer type of data.", "long: Specifies a variable can hold fairly large integer type of data."};
char LCS[][71] = {"for: Loop is used when the number of passes is known in advance.", "while: Loop is used when the number of passes is not known in advance.", "do: Loop is used to handle menu-driven programs."};
char JC[][138] = {"goto: Used to force immediate termination of a loop, bypassing the conditional expression and any remaining code in the body of the loop.", "continue: Used to take the control to the beginning of the loop bypassing the statements inside the loop.", "break: Used to take the control to required place in the program."};

int main() 
{
    while (control == 'Y') 
    {
        printf("\nInput a number to select a keyword type:\n1) Data Types\n2) Qualifiers\n3) Loop Control Structures\n4) Jumping Control\nEnter selection: ");

        scanf("%i", &input);
        getchar();

        if (input == 1) 
        {
            printf("\nInput a number to select a keyword:");
            printf("\n1) int\n2) char\n3) float\n4) double\nEnter selection: ");
            scanf("%i", &sel);
            getchar();
            if ((sel != 1) && (sel != 2) && (sel != 3) && (sel != 4)) {
                printf("\nInvalid input.\n");
                continue;
            }
            --sel;
            printf("\n%s\n", DT[sel]);
            sel = 0;
        } 
        else if (input == 2) 
        {
            printf("\nInput a number to select a keyword:");
            printf("\n1) signed\n2) unsigned\n3) short\n4) long\nEnter selection: ");
            scanf("%i", &sel);
            getchar();
            if ((sel != 1) && (sel != 2) && (sel != 3) && (sel != 4)) {
                printf("\nInvalid input.\n");
                continue;
            }
            --sel;
            printf("\n%s\n", Qu[sel]);
            sel = 0;
        } 
        else if (input == 3) 
        {
            printf("\nInput a number to select a keyword:");
            printf("\n1) for\n2) while\n3) do\nEnter selection: ");
            scanf("%i", &sel);
            getchar();
            if ((sel != 1) && (sel != 2) && (sel != 3)) {
                printf("\nInvalid input.\n");
                continue;
            }
            --sel;
            printf("\n%s\n", LCS[sel]);
            sel = 0;
        } 
        else if (input == 4) 
        {
            printf("\nInput a number to select a keyword:");
            printf("\n1) goto\n2) continue\n3) break\nEnter selection: ");
            scanf("%i", &sel);
            getchar();
            if ((sel != 1) && (sel != 2) && (sel != 3)) {
                printf("\nInvalid input.\n");
                continue;
            }
            --sel;
            printf("\n%s\n", JC[sel]);
            sel = 0;
        }
        else 
        {
            printf("\nInvalid input.\n");
            continue;
        } 

        printf("\nWould you like to continue? (Y/N) ");
        scanf(" %c", &control);
        control = toupper(control);
        if (control == 'Y') {
            printf("\e[1;1H\e[2J");
            // system("cls");
        }

    }
    printf("Goodbye.");
}
