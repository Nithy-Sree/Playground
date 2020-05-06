#include<iostream>
#include<string>
#include<cmath>
using namespace std;
int main() 
{ 
  string fnum;
  getline(cin,fnum);
 int i,j;
  for(i=0;i<fnum.size();i++)
  {
    if(fnum[i]=='.')
    break;
  }
  cout<<"Floating part is : ";
  for(j=i+1;j<fnum.size();j++)
  {
    cout<<fnum[j];
  }
}