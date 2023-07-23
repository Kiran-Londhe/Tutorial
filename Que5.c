#include<stdio.h>
#include<stdlib.h>

void Display(int Arr[],int iLength)
{
    int iCnt = 0;
    int iMult = 11;
    
    
    
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
      if(Arr[iCnt] % iMult == 0)

      {
      printf("The multiples of 11 is : %d\n", Arr[iCnt]); 
      } 
       
        
    }

   
}

int main()
{
  int iSize = 0;
  int *p = NULL;
  int iCnt = 0;
  

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
  Display(p, iSize);
  

  free(p);
  return 0;
}