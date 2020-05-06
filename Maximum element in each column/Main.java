#include<iostream>
using namespace std;
int main()
{
  int m,n;
  cin>>m>>n;
  int a[m][n],i,j;
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
      cin>>a[i][j];
    }
  }
  for(i=0;i<n;i++)
  {
    int max=a[0][i];
    for(j=1;j<m;j++)
    {
      if(a[j][i] > max)
        max=a[j][i];
    }
    cout<<max<<"\n";
  }
}