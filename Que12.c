/*Input:  iRow = 4  iCol = 4
Output: A B C D
        a b c d
        A B C D
        a b c d
*/

#include<stdio.h>

void Pattern(int iRow, int iCol)
{
    int i = 0;
    int j = 0;
    char ch1 ='A';
    char ch2 ='a';

  for(i = 1;  i <=iRow; i++)
 {
  for(j = 1; j <= iCol; j++)
  {
    if((i %2) != 0)
   {
    printf("%c\t",ch1);
    ch1++;
    
   }
   else
   {
    printf("%c\t",ch2);
    ch2++;
   }
  }
   printf("\n");
 }
 
}

int main()
{
    int iValue1 = 0;
    int iValue2 = 0;
    printf("Enter the number of rows: \n");
    scanf("%d",&iValue1);

    printf("Enter the number of column: \n");
    scanf("%d",&iValue2);


    Pattern(iValue1,iValue2);

    return 0;
}
