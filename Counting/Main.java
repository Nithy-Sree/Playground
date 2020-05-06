#include<iostream>
#include<string>
using namespace std;
int main()
{
  string s;
  getline(cin,s);
  int i;
  int vow=0,cons=0,ws=0,d=0,symbols=0;
  for(i = 0; s[i]!='\0'; ++i)
    {
        if(s[i]=='a' || s[i]=='e' || s[i]=='i' ||
           s[i]=='o' || s[i]=='u' || s[i]=='A' ||
           s[i]=='E' || s[i]=='I' || s[i]=='O' ||
           s[i]=='U')
        {
            ++vow;
        }
        else if((s[i]>='a'&& s[i]<='z') || (s[i]>='A'&& s[i]<='Z'))
        {
            ++cons;
        }
        else if(s[i]>='0' && s[i]<='9')
        {
            ++d;
        }
        else if (s[i]==' ')
        {
            ++ws;
        }
        else if(s[i] < 'A' || s[i] > 'Z' && s[i] < 'a' || s[i] > 'z')
          ++symbols;
    }
  cout<<"Vowels:"<<vow<<"\n"<<"Consonants:"<<cons<<"\n";
  cout<<"White Spaces:"<<ws<<"\n"<<"Digits:"<<d<<"\n";
  cout<<"Symbols:"<<symbols;
}