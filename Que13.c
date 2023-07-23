#include <stdio.h>

int Difference(char *str)
{
    int countSmall = 0;
    int countCapital = 0;

    while (*str != '\0')
    {
        if (*str >= 'a' && *str <= 'z')
        {
            countSmall++;
        }
        else if (*str >= 'A' && *str <= 'Z')
        {
            countCapital++;
        }
        str++;
    }

    return countSmall - countCapital;
}

int main()
{
    char arr[20];
    int difference = 0;

    printf("Enter the string: \n");
    scanf(" %[^\n]", arr);

    difference = Difference(arr);
    printf("Difference between small and capital letters: %d\n", difference);

    return 0;
}
