#include<stdio.h>
#include<stdlib.h>

 int Product(int Arr[], int iLength)
{
    int product = 1;
    int iCnt = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] % 2 != 0)
        {
            product *= Arr[iCnt];
        }
    }

    return product;
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

    iRet = Product(ptr, iSize);
    printf("Product of all odd elements: %d\n", iRet);

    free(ptr);

    return 0;
}
