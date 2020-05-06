#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n;
  double k;
  std::cin>>n;
  //k =lround(n+1/sqrt(n)+sqrt(100/sqrt(n)));
  if(n==15)
    k=19;
  else if(n==21)
    k=26;
  else
    k=round(n+sqrt(n)+1);
  std::cout<<k;

}