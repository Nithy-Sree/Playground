#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int m,n,req;
  cin>>m>>n>>req;
  int k = pow(m,n);
  if(req<=k)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}