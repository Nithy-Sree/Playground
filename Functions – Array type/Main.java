#include<iostream>
using namespace std;
int main()
{
  int i,n,o=0,e=0;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
    cin>>a[i];
  for(i=0;i<n;i++)
  {
    if(a[i]%2 == 0)
      e+=1;
    else
      o+=1;
  }
  cout<<"Enter the number of elements in the array\nEnter the elements in the array";
  cout<<"\n";
  if(e!=0 && o!=0)
    cout<<"The array is Mixed";
  else if(e==0)
    cout<<"The array is Odd";
  else
    cout<<"The array is Even";
}