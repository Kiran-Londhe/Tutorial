#include <stdio.h>

int IsDigit(char ch)
{
    if (ch >= '0' && ch <= '9')
        return 1;
    else
        return 0;
}

void DisplayDigit(char *str)
{
    printf("Digits are: ");
    while (*str != '\0')
    {
        if (IsDigit(*str))
        {
            printf("%c ", *str);
        }
        str++;
    }
    printf("\n");
}

int main()
{
    char arr[20];

    printf("Enter string: \n");
    scanf("%[^\n]s", arr);

    DisplayDigit(arr);

    return 0;
}
