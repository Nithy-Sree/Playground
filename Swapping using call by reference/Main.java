#include<iostream>
using namespace std;
void swap(int *a,int *b)
{
  int t;
  t=*a;
  *a=*b;
  *b=t;
}
int main()
{
  int a,b;
  cin>>a>>b;
  cout<<"Before swapping a= "<<a<<" and b="<<b<<"\n";
  swap(&a,&b);
  cout<<"After swapping a= "<<a<<" and b="<<b;
}