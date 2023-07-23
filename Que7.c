#include<stdio.h>
#include<stdlib.h>

int Frequency(int Arr[],int iLength)
{
    int iCnt = 0;
    int iEvenSum = 0;
    int iOddSum = 0;

    
    
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
      if((Arr[iCnt]  % 2) == 0)

      {
       iEvenSum += Arr[iCnt];
      } 
      else
      {
        iOddSum += Arr[iCnt];
      }
       
    }

   return (iEvenSum - iOddSum );
}

int main()
{
  int iSize = 0;
  int *p = NULL;
  int iCnt = 0;
  int iRet = 0;
  int iOddSum = 0;
  

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
  
  
  if (p[iCnt] % 2 != 0) 
  {
   iOddSum += p[iCnt];
  }
  }
  iRet = Frequency(p, iSize);
  
  printf("%d(%d - %d)", iRet, iRet + iOddSum, iOddSum);
  
  free(p);
  return 0;
}