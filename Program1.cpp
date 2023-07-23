#include <iostream>
using namespace std;

int countBits(int iPos) 
{
    int icount = 0;

    while(iPos) 
    {
        icount += iPos & 1;
        iPos >>= 1;
    }

    return icount;
}

int main() 
{
    int iValue = 0;
    int iRet = 0;
    cout<<"Enter a number "<<"\n";
    cin>>iValue;

    iRet = countBits(iValue);
    cout<<"Number of ON (1) bits "<<iRet<<"\n";

    return 0;
}
