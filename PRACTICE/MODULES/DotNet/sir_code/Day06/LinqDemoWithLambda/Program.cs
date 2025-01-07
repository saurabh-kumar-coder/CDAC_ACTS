namespace LinqWithLambda
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
    }

   

    public class Program
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
        static void Main(string[] args)
        {
            AddRecs();

            //var emps = from emp in lstEmp select emp;

            //foreach (var item in emps)
            //{
            //    Console.WriteLine(item);
            //}

            //var emps = lstEmp.Select(emp => emp);

            //foreach (var item in emps)
            //{
            //    Console.WriteLine(item);
            //}

            //var empName = lstEmp.Select(emp => emp.Name);

            //foreach (var item in empName)
            //{
            //    Console.WriteLine(item);
            //}

            //var basicEmp = lstEmp.Where(emp => emp.Basic is 10000).Select(emp => emp.Name);

            //foreach (var item in basicEmp)
            //{
            //    Console.WriteLine(item);
            //}

            //var empNameDesc = lstEmp.OrderByDescending(emp => emp.Name);

            //foreach (var item in empNameDesc)
            //{
            //    Console.WriteLine(item);
            //}

            // var empDeptJoinlist = lstEmp.Join(lstDept, emp => emp.DeptNo,
            //    dept => dept.DeptNo, (emp, dept) => new { emp, dept });
            // lstEmp.Join(lstDept, emp => emp.DeptNo, dept => dept.DeptNo, (emp, dept) => new { emp, dept });

            // foreach (var item in empDeptJoinlist)
            // {
            //    Console.WriteLine(item);
            // }
        }
    }
}