#define TRUE 1
#define FALSE 0
#include<stdio.h>
#include<ctype.h>


typedef int BOOL;

void DisplaySchedule(char chDiv)
{ 
  chDiv = toupper(chDiv);
 
if(chDiv == 'A')
{
  printf("Your Exam at 7 AM");
}

else if(chDiv == 'B')
{
  printf("Your Exam at 8:30 AM");
}

else if(chDiv =='C')
{
  printf("Your Exam at 9:20 AM");
}

else
{
  printf("Your Exam at 10:30 AM");
}

}


int main()
{
  char cValue = '\0';
  BOOL Ret = FALSE;

  printf("Enter your division : \n");
  scanf("%c",&cValue);

  DisplaySchedule(cValue);
  
  return 0;
}