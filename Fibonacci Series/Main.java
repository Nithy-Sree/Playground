#include<iostream>
using namespace std;
int main()
{
  int a=-1,b=1,c;
  int i=0,n;
  cin>>n;
  for(i=0;i<n;i++)
  {
    c = a+b;
    //cout<<c<<" ";
    a = b;
    b = c;
  }
  cout<<"The term "<<n<<" in the fibonacci series is "<<c;
}