#include <stdio.h>

int CountSmall(char *str)
{
    int count = 0;

    while (*str != '\0')
    {
        if (*str >= 'a' && *str <= 'z')
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

    iRet = CountSmall(arr);
    printf("Number of small letters: %d\n", iRet);

    return 0;
}
