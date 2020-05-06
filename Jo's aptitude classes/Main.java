#include<iostream>
using namespace std;
int main()
{
  int a,b,c,r;
  cin>>a>>b>>c>>r;
  int hcf,s;
  s = a<b?(a<c?a:c):(b<c?b:c);
  for(hcf = s;hcf>=1;hcf--)
  {
    if(a%hcf ==0 && b%hcf ==0 && c%hcf == 0)
      break;
  }
  if(hcf == r)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}