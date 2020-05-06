#include<iostream>
#include<cmath>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int t = n;
  int r,res=0,x=0,p;
  while(t!=0)
  {
    t=t/10;
    ++x;
  }
  t=n;
  while(t!=0){
  	r = t%10;
    p = round(power(r,x));
  	res = res+ p;
    t=t/10;
  }
  if(res==n)
    return 1;
  else
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}