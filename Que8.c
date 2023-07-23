#include<stdio.h>

void Display(char ch)
{
  int iLength = 0;
    if ((ch >= 'a') && (ch <= 'z'))
    {
      while(ch >= 'a')
      {
        printf("%c", ch);
        ch--;
      }
    }
    else if((ch >= 'A') && (ch <= 'Z'))
    {
      while(ch <= 'Z')
      {
        printf("%c", ch);
        ch++;
      }
    }
    
  }
  

int main()
{
  char cValue = '\0'; 
  

  printf("Enter the character : \n");
  scanf("%c",&cValue);

  Display(cValue);
  printf("\n");
  
  return 0;
}