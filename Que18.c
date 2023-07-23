#include <stdio.h>
#include <stdlib.h>

int Difference(int Arr[], int iLength)
{
    int iCnt = 0;
    int iMin = Arr[0];
    int iMax = Arr[0];

    for(iCnt = 1; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] < iMin)
        {
            iMin = Arr[iCnt];
        }
        if(Arr[iCnt] > iMax)
        {
            iMax = Arr[iCnt];
        }
    }

    return iMax - iMin;
}

int main()
{
    int iSize = 0;
    int *ptr = NULL;
    int iCnt = 0;
    int iRet = 0;

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

    iRet = Difference(ptr, iSize);

    printf("Difference between the largest and smallest numbers: %d\n", iRet);

    free(ptr);

    return 0;
}
