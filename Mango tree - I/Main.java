#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,z,i,j,m[100][100],c=1;
  cin>>x>>y>>z;
  for(i=0;i<x;i++)
  {
    for(j=0;j<y;j++){
      m[i][j]=c;
      c++;
    }
  }
  for(i=0;i<x;i++)
  {
    for(j=0;j<y;j++){
      if(z==m[i][j]){
        if(i==0 || j==0 || j==x-1)
          cout<<"Yes";
        else
          cout<<"No";
      }
    }
  }
  
}