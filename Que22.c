#include <stdio.h>

int CountChar(char *str, char ch)
{
    int iCount = 0;

    while (*str != '\0')
    {
     if ((*str >= 'a') && (*str <= 'z') || (*str >= 'A') && (*str <= 'Z'))
    {
      if(*str == ch)
      iCount++;
    }
     str++;
    }  
    return iCount;
}

int main()
{
    char arr[20];
    int iRet = 0;
    char cValue = 0;

    printf("Enter string: \n");
    scanf(" %[^\n]s", arr);

    printf("Enter the character: \n");
    scanf(" %c",&cValue);
    
    iRet = CountChar(arr,cValue);
    printf("Character frequency is %d\n",iRet);
    

    return 0;
}
