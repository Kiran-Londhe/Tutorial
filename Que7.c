#include<stdio.h>

void Display(char *ch1, char *ch2)
{
  
    if ((*ch1 >= 'a') && (*ch1 <= 'z'))
    {
      *ch2 = *ch1 - 32;
    }
    else if((*ch1 >= 'A') && (*ch1 <= 'Z'))
    {
     *ch2 = *ch1 + 32; 
    }
    else
    {
      *ch1 = *ch2;
    }
     
  }
  

int main()
{
  char cValue1 = '\0'; 
  char cValue2 = '\0';

  printf("Enter the character : \n");
  scanf("%c",&cValue1);

  Display(&cValue1,&cValue2);

  printf("Modified characters: %c\n",cValue2);
  
  return 0;
}