#include <iostream>
using namespace std;
int main() {
    int n,i,j,c=0;
  	cin>>n;
  int a[n][n];
  int k;
   	for(i=0;i<n;i++,k++)
    {
      for(j=0;j<n;j++)
      {
        if(j==n-1){
          if(i%2)
            a[i][j]=i+1;
          else
            a[i][j]=i+2;
        }
        else if(j==0){
          if(i%2)
            a[i][j]=i+2;
          else
            a[i][j]=i+1;
        }
        else
          a[i][j]=i+1;
      }
    }
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      cout<<a[i][j];
    }
    cout<<"\n";
  }
    return 0;
}