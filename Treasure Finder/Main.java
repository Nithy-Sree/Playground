#include<iostream>
using namespace std;
int gcd(int a,int b)
{
  if(a==0)
    return b;
  return gcd(b%a,a);
}
int main()
{
  int a,b,c,res;
  cin>>a>>b>>c;
  if((a>=b && a<=c) ||(a>=c && a<=b))
    cout<<"The treasure is in box which has number "<<a<<"\n";
  else if((b>=a && b<=c)||(b>=c && b<=a))
    cout<<"The treasure is in box which has number "<<b<<"\n";
  else
    cout<<"The treasure is in box which has number "<<c<<"\n";
  int x = (b-a);
  int y = (c-b);
  int z = (c-a);
  int hcf,st;
  st = a<b?(a<c?a:c):(b<c?b:c);
  for(hcf = st;hcf>=1;hcf--){
    if (a%hcf==0 && b%hcf==0 && c%hcf==0)
  		 break;
  }
  
  res = gcd(x, gcd(y,z));
  cout<<"The code to open the box is "<<hcf;
}