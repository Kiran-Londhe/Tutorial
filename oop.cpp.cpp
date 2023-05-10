//class = Characteristics + Behaviours
//class = Data + Functions

#include<iostream>
using namespace std;
class Demo
{
    public:
    int NO1;
    int NO2;

    void fun()
    {

        cout<<"Inside fun\n";
    }

    };

    int main()
{
Demo obj1;
Demo obj2;
cout<<"size of object : "<<sizeof(obj1)<<"\n";
//8
obj1.NO1 = 10;
obj1.NO2 = 20;

obj2.NO1 = 30;
obj2.NO2 = 40;

obj1.fun();// inside fun
obj2.fun();// inside fun

cout<<obj1.NO2<<"\n";

return 0;
}
