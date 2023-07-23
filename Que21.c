#include <stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkChar(char *str, char ch)
{
    while (*str != '\0')
    {
     if ((*str >= 'a') && (*str <= 'z') || (*str >= 'A') && (*str <= 'Z'))
    {
      if (*str == ch)
      return TRUE;
    }
     str++;
     
    }  
    return FALSE;
}

int main()
{
    char arr[20];
    BOOL bRet = FALSE;
    char cValue = 0;

    printf("Enter string: \n");
    scanf(" %[^\n]s", arr);

    printf("Enter the character: \n");
    scanf(" %c",&cValue);
    
    bRet = ChkChar(arr,cValue);
    if (bRet == TRUE)
    {
        printf("Character found\n");
    }
    else
    {
        printf("Character not found\n");
    }

    return 0;
}
