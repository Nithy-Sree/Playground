#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,i;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
    cin>>a[i];
  int max = a[0];
  for(i=0;i<n;i++)
  {
    if(a[i]>max)
      max=a[i];
  }
  cout<<max;
}