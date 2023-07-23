#include <stdio.h>
#include <stdlib.h>

void Digits(int Arr[], int iLength)
{
    int iCnt = 0;
    
    
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] >= 100 && Arr[iCnt] <= 999)
        
        {
            printf("%d ", Arr[iCnt]);
        }
    }
    
    printf(" is three digit numbers : \n");
}

int main()
{
    int iSize = 0;
    int *ptr = NULL;
    int iCnt = 0;

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

    Digits(ptr, iSize);

    free(ptr);

    return 0;
}
