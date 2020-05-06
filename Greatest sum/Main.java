#include<iostream>
#include <bits/stdc++.h> 
using namespace std;
int main()
{
  int r,c,i,j;
  cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  int rsum = 0;
  int idx = -1;
  int rmaxSum = INT_MIN;
  cout<<"Sum of rows is ";
  for (i = 0; i < r; ++i) { 
        for (j = 0; j < c; ++j) { 
            rsum = rsum + a[i][j]; 
        } 
  		if(rsum>rmaxSum){
          rmaxSum=rsum;
          idx = i;
        }
        cout<<rsum<<" ";
        rsum = 0; 
    } 

  cout<<"\nRow "<<idx+1<<" has maximum sum";
  int csum = 0; 
  int cidx = -1;
  int cmaxSum = INT_MIN;
  cout<<"\nSum of columns is ";
    for (i = 0; i < r; ++i) { 
        for (j = 0; j < c; ++j) { 
            csum = csum + a[j][i]; 
        } 
  		if(csum>cmaxSum){
          cmaxSum = csum;
          cidx = i;
        }
        cout<<csum<<" ";
        csum = 0; 
    } 
  cout<<"\nColumn "<<cidx+1<<" has maximum sum";
}

  
