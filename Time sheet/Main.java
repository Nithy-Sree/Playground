#include<iostream>
using namespace std;
int main()
{
  int d1,d2,d3,d4,d5,d6,d7;
  cin>>d1>>d2>>d3>>d4>>d5>>d6>>d7;
  int bon,brate,r1,r2,r3,r4,r5,r6,r7,x=0;
  int edays,totaldays, totalrate;
  r1 = d1*150;
  r7 = d7*125;
  if(d2 <=8){
    r2=d2*100;
  }
  else if(d2>8)
  {
    bon = d2-8;
    brate = bon*115;
    r2 = brate + 800;
  }
  if(d3 <=8){
    r3=d3*100;
  }
  else if(d3>8)
  {
    bon = d3-8;
    brate = bon*115;
    r3 = brate + 800;
  }
  if(d4 <=8){
    r4=d4*100;
  }
  else if(d4>8)
  {
    bon = d4-8;
    brate = bon*115;
    r4 = brate + 800;
  }
  if(d5<=8){
    r5=d5*100;
  }
  else if(d5>8)
  {
    bon = d5-8;
    brate = bon*115;
    r5 = brate + 800;
  }
  if(d6 <=8){
    r6=d6*100;
  }
  else if(d6>8)
  {
    bon = d6-8;
    brate = bon*115;
    r6 = brate + 800;
  }
  totaldays = d2+d3+d4+d5+d6;
  if(totaldays>40)
  {
    edays = totaldays-40;
    x=edays*25;
  }
  totalrate = r1+r2+r3+r4+r5+r6+r7+x;
  cout<<totalrate;
}