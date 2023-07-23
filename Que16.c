#include <stdio.h>
#include <stdlib.h>

int Maximum(int Arr[], int iLength)
{
    int iMax = 0; 
    int iCnt = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] > iMax)
        {
        iMax = Arr[iCnt];
        }
    }

    return iMax;
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

    iRet = Maximum(ptr, iSize);
    printf("Largest number: %d\n", iRet);

    free(ptr);

    return 0;
}
