#include<iostream>
using namespace std;
int gcd(int a,int b)
{
  int i,g;
  for(i=1;i<=a && i<=b;i++)
  {
    if(a%i ==0 && b%i == 0)
      g = i;
  }
  return g;
}
int main()
{
  int a,b;
  cin>>a>>b;
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd(a,b);
}