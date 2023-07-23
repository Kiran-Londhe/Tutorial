#include<stdio.h>
#include<stdlib.h>

void Range(int Arr[], int iLength, int iStart, int iEnd)
{
    int iCnt = 0;
    int found = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
      if(Arr[iCnt] >= iStart && Arr[iCnt] <= iEnd)
        {
          if (!found)
            {
                printf("Elements within the range %d - %d are:\n", iStart, iEnd);
                found = 1;
            }
            printf("%d\n", Arr[iCnt]);
        }
    }

    if (!found)
    {
        printf("No elements found within the range %d - %d.\n", iStart, iEnd);
    }
}

int main()
{
    int iSize = 0;
    int *ptr = NULL;
    int iCnt = 0, iStart = 0, iEnd = 0;

    printf("Enter the number of elements: ");
    scanf("%d", &iSize);

    ptr = (int *)malloc(iSize * sizeof(int));
    if(ptr == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    printf("Enter the elements: \n");
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        scanf("%d", &ptr[iCnt]);
    }

    printf("Enter the range (start and end): ");
    scanf("%d %d", &iStart, &iEnd);

    Range(ptr, iSize, iStart, iEnd);

    free(ptr);

    return 0;
}
