#include <iostream>
#include <fstream>
#include <vector>
#include <string>
#include <sstream>
#include <map>
#include <algorithm>
#include <ctime>

using namespace std;

struct Employee
{
    string name;
    string dob;
    string city;
    int age;
};

int calculateAge(int day, int month, int year)
{
    // cout << "calc date : " << day << " : " << month << " : "  << year << endl;
    time_t now = time(0);
    tm *ltm = localtime(&now);

    int current_day = ltm->tm_mday;
    int current_month = ltm->tm_mon + 1;
    int current_year = ltm->tm_year + 1900;

    int age = current_year - year;
    if (current_month < month || (current_month == month && current_day < day))
    {
        age--;
    }
    return age;
}

void categorizeEmployees(vector<Employee> &employees)
{
    map<int, vector<Employee>> ageGroups;

    for (auto &emp : employees)
    {
        stringstream ss(emp.dob);
        int day, year;
        string month;
        ss >> day;
        ss.ignore(1);
        ss >> month;
        ss.ignore(1);
        ss >> year;

        // cout << "ss : " << ss.str() << endl;

        int age = calculateAge(day, month == "Jan" ? 1 : month == "Feb" ? 2
                                                     : month == "Mar"   ? 3
                                                     : month == "Apr"   ? 4
                                                     : month == "May"   ? 5
                                                     : month == "Jun"   ? 6
                                                     : month == "Jul"   ? 7
                                                     : month == "Aug"   ? 8
                                                     : month == "Sep"   ? 9
                                                     : month == "Oct"   ? 10
                                                     : month == "Nov"   ? 11
                                                                        : 12,
                               year);
        // cout << "age : " << age << endl;
        emp.age = age;

        int category = (age / 10) * 10;
        ageGroups[category].push_back(emp);
        // cout<< "category : " << category;
    }

    vector<pair<int, vector<Employee>>> sortedAgeGroups(ageGroups.begin(), ageGroups.end());
    for (auto &group : sortedAgeGroups)
    {
        cout << "Category " << group.first << "-" << group.first + 9 << " - count: " << group.second.size() << endl;
        for (auto &emp : group.second)
        {
            cout << emp.name << ", " << emp.dob << ", " << emp.city << endl;
        }
        cout << endl;
    }
}

int main()
{
    ifstream inputFile("employees.txt");
    vector<Employee> employees;

    if (!inputFile)
    {
        cout << "Error opening file!" << endl;
        return 1;
    }

    string line;
    while (getline(inputFile, line))
    {
        stringstream ss(line);
        Employee emp;
        string dob;
        getline(ss, emp.name, ',');
        getline(ss, dob, ',');
        getline(ss, emp.city);
        // cout<< "string stream : " << ss.str() << endl;
        emp.dob = dob;
        employees.push_back(emp);
    }

    inputFile.close();

    categorizeEmployees(employees);

    return 0;
}