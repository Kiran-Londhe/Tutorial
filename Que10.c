#include<stdio.h>

void Display(char ch)
{

printf("ASCII value of '%c' is %d\n",ch);
printf("ASCII value in Octal is '%o'\n",ch);
printf("ASCII value in Hexadecimal is '%x'\n",ch);

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