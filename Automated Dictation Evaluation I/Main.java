#include<iostream>
#include<string>
using namespace std;
int main()
{
  string s1,s2;
  getline(cin,s1);
  getline(cin,s2);
  int x = s1.compare(s2);
  if(x!=0)
    cout<<"It is wrong";
  else
    cout<<"It is correct";
}