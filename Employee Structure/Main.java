#include<iostream>
using namespace std;
struct employee
{
  char name[30];
  int id;
  int age;
  char desn[20];
  int sal;
};
int main()
{
  struct employee e;
  cin>>e.name;
  cin>>e.id;
  cin>>e.age;
  cin>>e.desn;
  cin>>e.sal;
  cout<<"Enter name:\nEnter ID:\nEnter age:\nEnter designation:\nEnter Salary:\n";
cout<<"Employee Details\n";
cout<<"Name of the Employee : "<<e.name<<"\n";
cout<<"ID of the Employee : "<<e.id<<"\n";
cout<<"Age of the Employee : "<<e.age<<"\n";
cout<<"Designation of the Employee : "<<e.desn<<"\n";
cout<<"Salary of the Employee : "<<e.sal<<"\n";
}