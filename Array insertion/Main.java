#include<iostream>
using namespace std;
int main()
{
  int n,i;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
  	cin>>a[i];
  }
  int l,val;
  cin>>l>>val;
  n++;
  for(i=n;i>=l;i--)
    a[i]=a[i-1];
  a[l-1]=val;
  cout<<"Enter the number of elements in the array\nEnter the elements in the array\nEnter the location where you wish to insert an element\n";
  if(l>n){
    cout<<"Invalid Input";
  }
  else{
    cout<<"Enter the value to insert\nArray after insertion is\n";
  for(i=0;i<n;i++)
    cout<<a[i]<<"\n";
  }
}