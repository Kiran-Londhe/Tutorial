#include<iostream>
using namespace std;

int ToggleBit(int iNo)
{
  int iMask = 0X00000006;
  int iRResult = 0;

  return (iNo ^ iMask);
}

int main()
{
   
   int iValue = 0;
   int iRet = 0;

   cout<<"Enter the Number "<<"\n";
   cin>>iValue;

   iRet = ToggleBit(iValue);
   cout<<"Result is "<<iRet<<"\n";

  return 0;
}