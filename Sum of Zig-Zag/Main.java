#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,r1=0,cn=0,d=0;
  cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>a[i][j];
  for(i=0;i<=0;i++){
    for(j=0;j<c-1;j++){
      r1+=a[i][j];
    }
  }
  for(j=c-1;j==c-1;j--){
    for(i=0;i<r;i++){
      cn+=a[j][i];
    }
  }
  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
      if((i+j)==(r-1)){
        d+=a[i][j];
      }
      if(j == 0 && i == r-1){
      	cn -= a[i][j];
      }
    }
  }
  cout<<"Sum of Zig-Zag pattern is "<<(r1+cn+d);
}