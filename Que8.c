#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

bool Check(int Arr[],int iLength)
{
    int iCnt = 0;
    int iCheck = 11;
    
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
      if(Arr[iCnt] == iCheck)

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
  bool bRet = 0;
  

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
  bRet = Check(p, iSize);
  if(bRet == true)
  {
    printf("11 is present");
  }
  else
  {
    printf("11 is absent");
  }
  
  free(p);
  return 0;
}