﻿namespace n1
{
    public class Employee
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }
        public decimal Basic { get; set; }
        public int DeptNo { get; set; }
        public string Gender { get; set; }
        public override string ToString()
        {
            string s = Name + "," + EmpNo.ToString() + "," + Basic.ToString() + "," + DeptNo.ToString();
            return s;
        }
    }
    public class Department
    {
        public int DeptNo { get; set; }
        public string DeptName { get; set; }

        public override string ToString()
        {
            string s = DeptNo.ToString() + "," + DeptName;
            return s;
        }
    }

    public class Tester
    {
        static List<Employee> lstEmp = new List<Employee>();
        static List<Department> lstDept = new List<Department>();
        public static void AddRecs()
        {
            lstDept.Add(new Department { DeptNo = 10, DeptName = "SALES" });
            lstDept.Add(new Department { DeptNo = 20, DeptName = "MKTG" });
            lstDept.Add(new Department { DeptNo = 30, DeptName = "IT" });
            lstDept.Add(new Department { DeptNo = 40, DeptName = "HR" });

            lstEmp.Add(new Employee { EmpNo = 1, Name = "Vikram", Basic = 10000, DeptNo = 10, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 2, Name = "Vishal", Basic = 11000, DeptNo = 10, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 3, Name = "Abhijit", Basic = 12000, DeptNo = 20, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 4, Name = "Mona", Basic = 11000, DeptNo = 20, Gender = "F" });
            lstEmp.Add(new Employee { EmpNo = 5, Name = "Shweta", Basic = 12000, DeptNo = 20, Gender = "F" });
            lstEmp.Add(new Employee { EmpNo = 6, Name = "Sanjay", Basic = 11000, DeptNo = 30, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 7, Name = "Arpan", Basic = 10000, DeptNo = 30, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 8, Name = "Shraddha", Basic = 11000, DeptNo = 40, Gender = "F" });
        }
        public static void Main()
        {
            AddRecs();

            // to get all employees
            // var emps = from emp in lstEmp select emp;

            // foreach (var item in emps)
            // {
            //     System.Console.WriteLine(item);
            // }

            // to get add departments
            // var depts = from dept in lstDept select dept;

            // foreach (var item in depts)
            // {
            //     System.Console.WriteLine(item);
            // }

            // to get all employees names
            // var empNames = from emp in lstEmp select emp.Name;

            // foreach (var item in empNames)
            // {
            //     System.Console.WriteLine(item);
            // }

            // to get employee with their dept number
            // var employeeWithDept = from emp in lstEmp
            //                         join dept in lstDept
            //                             on emp.DeptNo equals dept.DeptNo
            //                         select new {emp, dept};

            // foreach (var item in employeeWithDept)
            // {
            //     System.Console.WriteLine(item);
            // }

            // to get employee with their dept number order by employee name
            // var employeeWithDeptOrderByName = from emp in lstEmp
            //                                     join dept in lstDept
            //                                         on emp.DeptNo equals dept.DeptNo
            //                                     orderby emp.Name
            //                                     select new {emp, dept};

            // foreach (var item in employeeWithDeptOrderByName)
            // {
            //     System.Console.WriteLine(item);
            // }

            // to get employee name and dept name
            // var employeeNameWithDeptName = from emp in lstEmp
            //                                 join dept in lstDept
            //                                     on emp.DeptNo equals dept.DeptNo
            //                                 select new {emp.Name, dept.DeptName};

            // foreach (var item in employeeNameWithDeptName)
            // {
            //     System.Console.WriteLine(item);
            // }
        }
    }
}