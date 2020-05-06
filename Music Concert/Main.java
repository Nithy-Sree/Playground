#include<iostream>
using namespace std;
int main(){
  int n,i;
  cin>>n;
  int a[n],m=0,f=0;
  for(i=0;i<n;i++)
    cin>>a[i];
  for(i=0;i<n;i++)
  {
    if(a[i]%2 == 0)
      f++;
    else
      m++;
  }
  cout<<m<<"\n"<<f;
  return 0;
}