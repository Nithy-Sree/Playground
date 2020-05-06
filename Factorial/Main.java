#include<iostream>
using namespace std;
int fact(int n)
{
  int i,f=1;
  for(i=1;i<=n;i++)
    f=f*i;
  return f;
}
int main()
{
  int n;
  cin>>n;
  cout<<"The factorial of "<<n<<" is "<<fact(n);
}