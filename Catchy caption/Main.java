#include <cstring>
#include<string.h>
#include <iostream>
using namespace std;
int main()
{
  string s;
  getline(cin,s);
  int cnt=0,i;
  for(i=0;s[i]!='\0';i++)
  {
    if(s[i]==' ')
      cnt+=1;
  }
  if(cnt>10)
  {
    cout<<"Caption not eligible for the contest";
  }
  else
    cout<<"Caption eligible for the contest";
}