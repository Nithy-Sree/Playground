#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  string s1,s2,s3;
  getline(cin,s1);
  getline(cin,s2);
  reverse(s2.begin(),s2.end());
  if(s1.compare(s2))
    cout<<"It is wrong";
  else
    cout<<"It is correct";
}