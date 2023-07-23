#include<stdio.h>

void DisplayASCII(char ch)
{ 
 printf("The ASCII value of '%c' is: %d\n",ch);
}

int main()
{
  char ch = 0; 

  printf("Enter the character : \n");
  scanf("%c",&ch);

  DisplayASCII(ch);
  
  return 0;
}