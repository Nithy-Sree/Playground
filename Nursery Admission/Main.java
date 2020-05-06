#include<iostream>
using namespace std;
int main()
{
  string str;
  getline(cin,str);
  int c=0,i=0;
  while(str[i]!='\0')
  {
    c+=1;
    i+=1;
  }
  cout<<"The number of letters in the name is "<<c;
}