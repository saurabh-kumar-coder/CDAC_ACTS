#include <iostream>
using namespace std;
struct Employee
{
    int id;
    int salary;
    void setId(int x)
    {
        id = x;
    }
    int getId()
    {
        return id;
    }
    void setSalary(int sal)
    {
        salary = sal;
    }

    int getSalary()
    {
        return salary;
    }
};
void display(Employee e)
{
    cout << "Id is : " << e.getId() << ", Salary is : " << e.getSalary() << "\n";
}

int main()
{
    Employee e, e2;
    e.setId(1);
    e.setSalary(4500);
    display(e);
    e2.setId(2);
    e2.setSalary(2312);
    display(e2);
}