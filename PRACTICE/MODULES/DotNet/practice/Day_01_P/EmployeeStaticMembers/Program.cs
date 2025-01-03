using System.Dynamic;

namespace employeeConstructor
{
    public class Employee
    {
        private static int employeeCounter = 0;
        private string name;
        public string Name { get { return name; } set { this.name = value; } }
        private int empNo;
        public int EmpNo
        {
            get { return empNo; }
            set { this.empNo = value; }
        }
        private decimal basic;
        public decimal Basic
        {
            get { return basic; }
            set { if (value < 1000) this.basic = 1000; else this.basic = value; }
        }
        private short deptNo;
        public short DeptNo
        {
            get { return deptNo; }
            set { if (value < 0) System.Console.WriteLine("deptno must be greated than 0"); else this.deptNo = value; }
        }
        public Employee(string Name = "ABC", decimal Basic = 1000, short DeptNo = 101)
        {
            this.EmpNo = ++employeeCounter;
            this.Name = Name;
            this.Basic = Basic;
            this.DeptNo = DeptNo;
        }

        public decimal getNetSalary()
        {
            return Basic + 1000;
        }

        public override string ToString()
        {
            return $"Name: {Name}, EmpNo: {EmpNo}, Basic: {Basic}, DeptNo: {DeptNo}, NetSalary: {getNetSalary()}";
        }

    }

    public class Tester
    {
        public static void Main()
        {
            Employee employee1 = new Employee(Name: "Amol", Basic: 123456, DeptNo: 10);
            Employee employee2 = new Employee(Name: "Amol", Basic: 123456);
            Employee employee3 = new Employee(Name: "Amol");
            Employee employee4 = new Employee();
            System.Console.WriteLine(employee1);
            System.Console.WriteLine(employee2);
            System.Console.WriteLine(employee3);
            System.Console.WriteLine(employee4);
            System.Console.WriteLine("@@@@@@@@@@ break @@@@@@@@@");
            System.Console.WriteLine(employee4);
            System.Console.WriteLine(employee3);
            System.Console.WriteLine(employee2);
            System.Console.WriteLine(employee1);
        }
    }
}
