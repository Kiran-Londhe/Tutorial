#include <stdio.h>

int CountCapital(char *str)
{
    int count = 0;

    while (*str != '\0')
    {
        if (*str >= 'A' && *str <= 'Z')
        {
            count++;
        }
        str++;
    }

    return count;
}

int main()
{
    char arr[20];
    int iRet = 0;

    printf("Enter the string: \n");
    scanf(" %[^\n]", arr);

    iRet = CountCapital(arr);
    printf("Number of capital letters: %d\n", iRet);

    return 0;
}
