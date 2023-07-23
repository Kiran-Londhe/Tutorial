#include<stdio.h>
#include<stdlib.h>

int Frequency(int Arr[],int iLength,int iNo)
{
    int iCnt = 0;
    int iCount = 0;
    
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
      if(Arr[iCnt] == iNo)

      {
       iCount++;
       
      } 
      
       
    }

   return iCount;
}

int main()
{
  int iSize = 0;
  int *p = NULL;
  int iCnt = 0;
  int iRet = 0;
  int iValue = 0;
  

  printf("enter the elements");
  scanf("%d",&iSize);

  p = (int *)malloc(iSize * sizeof(int));
  if(p == NULL)
  {
    printf("Unable to allocate the memory");
    return -1;
  }

  printf("Enter elements: \n");
  for(iCnt = 0; iCnt < iSize; iCnt++)
  {
    printf("Enter elements :%d",iCnt+1);
    scanf("%d",&p[iCnt]);
  }

  printf("Enter the number to find its frequency: ");
  scanf("%d", &iValue);
  iRet = Frequency(p, iSize,iValue);
  printf("Frequency of %d in the given array is: %d", iValue, iRet);
  
  free(p);
  return 0;
}