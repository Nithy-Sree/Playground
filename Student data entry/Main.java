#include <iostream>
#include<cstring>
using namespace std;
struct student
{
    string name;
    int roll;
    float marks;
};
int main() 
{
  struct student s;
  getline(cin,s.name);
  cin>>s.roll>>s.marks;
  cout<<"\nStudent Details\n";
  cout<<"Name: "<<s.name<<"\n";
  cout<<"Roll: "<<s.roll<<"\n";
  cout<<"Marks: "<<s.marks;
}