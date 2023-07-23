#define TRUE 1
#define FALSE 0
#include<stdio.h>

typedef int BOOL;

BOOL ChkSmall(char ch)
{ 

 if((ch >= 'a') && (ch <= 'z'))
{
  return TRUE;
}
else
{
  return FALSE;
}
}

int main()
{
  char cValue = '\0';
  BOOL bRet = FALSE;

  printf("Enter the Character : \n");
  scanf("%c",&cValue);

  bRet = ChkSmall(cValue);
  if(bRet == TRUE)
  {
    printf("It is small chracter : \n");
  }
  else
  {
    printf("It is not small character : \n");
  }

  return 0;
}