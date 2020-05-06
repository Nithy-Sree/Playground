#include<bits/stdc++.h> 
#include<iostream>
using namespace std; 
int digitalroot(string n)
{
  if(n.compare("0")==0)
    return 0;
  int a=0,i;
  for(i=0;i<n.length();i++)
    a = (a+n[i]-'0')%9;
  return (a == 0)? 9 : a % 9;
}
int main()
{
  string n;
  cin>>n;
  cout<<digitalroot(n);
}