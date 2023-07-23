#include<iostream> 
using namespace std;

int OffBit(int iNo, int iPos)
{
    int iMask = 0x00000002;
    int iResult = 0;

    iResult = iNo & iMask;
    if(iResult == iMask)
    {
      return (iNo ^ iMask);
    }
    else
    {
      return iNo;
    }
}

int main()
{
    int iValue = 0;
    int iBit = 0;

    int iRet = 0;

    cout<<"Enter the Number "<<"\n";
    cin>>iValue;

    cout<<"Enter the postion of Bit that you want to OFF "<<"\n";
    cin>>iBit;

    iRet = OffBit(iValue,iBit);

    cout<<"Result is "<<iRet<<"\n";

  return 0;
}