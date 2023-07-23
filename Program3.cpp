#include<iostream>
using namespace std;

bool ChkBit(int iNo)
{
     int iMask = 0X00000100;
     int iResult = 0;
  
  iResult = iNo & iMask;
  if(iResult == iMask)
  {
     cout<<"true "<<"\n";
  }
  else
  {
    cout<<"false "<<"\n";
  }
  return iResult;
}

int main()
{ 
    int iValue = 0;
    bool bRet = false;

    cout<<"Enter the Number "<<"\n";
    cin>>iValue;

    bRet = ChkBit(iValue);

    return 0;
}