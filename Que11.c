#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

bool Check(int Arr[],int iLength,int iNo)
{
    int iCnt = 0;
    int iCheck = 0;
    
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
      if(Arr[iCnt] == iNo)

      {
       return true;
       
      } 
      
       
    }

   return false;
}

int main()
{
  int iSize = 0;
  int *p = NULL;
  int iCnt = 0;
  bool bRet = false;
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
    
  bRet = Check(p, iSize,iValue);
  if(bRet == true)
  {
    printf("Number is present");
  }
  else
  {
    printf("Number is absent");
  }
  
  free(p);
  return 0;
}