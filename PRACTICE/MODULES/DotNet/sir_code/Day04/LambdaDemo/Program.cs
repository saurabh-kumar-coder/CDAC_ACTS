namespace LambdaDemo
{
    public class Employee
    {
        public int EmpNo { get; set; }
        public String Name { get; set; }
        public decimal Basic { get; set; }

        public Employee (int EmpNo, String Name, decimal Basic)
        {
            this.EmpNo = EmpNo;
            this.Name = Name;
            this.Basic = Basic;
        }
    }
    public class Tester
    {
        public static void Main()
        {
            Func<int, int> f1 = a => a * 2;
            System.Console.WriteLine(f1(4));

            Func<int, int, int> f2 = (a, b) => a + b;
            System.Console.WriteLine(f2(4, 6));

            Predicate<int> p1 = a => a % 2 == 0;
            System.Console.WriteLine(p1(45));
            System.Console.WriteLine(p1(56));

            Employee employee01 = new Employee(1, "ABC", 30000); 
            Predicate<Employee> p2 = e => e.Basic > 10000;
            System.Console.WriteLine(p2(employee01));
        }
    }
}