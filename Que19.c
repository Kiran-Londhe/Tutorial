/*Input:  iRow = 5   iCol = 5
Output: 1  2  3  4  5
       -1 -2 -3 -4 -5
        1  2  3  4  5
       -1 -2 -3 -4 -5
        1  2  3  4  5
        */

#include <stdio.h>

void Pattern(int iRow, int iCol)
{
    int i, j;

    for (i = 1; i <= iRow; i++)
    {
        if (i % 2 == 1) 
        {
            for (j = 1; j <= iCol; j++)
            {
                printf("%d\t", j);
            }
        }
        else 
        {
            for (j = 1; j <= iCol; j++)
            {
                printf("%d\t", -j);
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
    scanf("%d", &iValue1);

    printf("Enter the number of columns: \n");
    scanf("%d", &iValue2);

    Pattern(iValue1, iValue2);

    return 0;
}
