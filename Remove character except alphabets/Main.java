#include<iostream>
using namespace std;
int main()
{
  string s1;
  getline(cin,s1);
  int i;
  for(i=0;i<s1.size();i++)
  {
    if(s1[i] < 'A' || s1[i] > 'Z' && s1[i] < 'a' || s1[i] > 'z'){
      s1.erase(i,1);
      i-=1;
    }
  }
  cout<<s1;
}