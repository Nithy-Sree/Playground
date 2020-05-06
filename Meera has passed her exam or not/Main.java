#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,x,i,flag=0;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
    cin>>a[i];
  cin>>x;
  for(i=0;i<n;i++)
  {
    if(a[i]==x)
      flag=1;
  }
  if(flag==1)
    cout<<"She passed her exam";
  else
    cout<<"She failed";
}