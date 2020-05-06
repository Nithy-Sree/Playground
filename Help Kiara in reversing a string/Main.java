#include <iostream>
#include <bits/stdc++.h> 
#include <string> 
using namespace std; 
int main()
{
char str[100], rev[100];     
int count = 0, end, i;    
std::cin.getline(str,100);
  //int n = str.size();
  while(str[count])
    count++;
  /*for(i=0;i>=str.size();i++)
  {
    rev[end--] = str[i];
  }*/
  for (i = 0; i < count / 2; i++) 
        swap(str[i], str[count - i - 1]);
std::cout<<str;
}