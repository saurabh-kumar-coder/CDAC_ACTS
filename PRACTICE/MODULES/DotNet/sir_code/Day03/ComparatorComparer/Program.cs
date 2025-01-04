namespace n1
{
    public class Employee01 : IComparer<Object>
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }
        public decimal Basic { get; set; }
        public short DeptNo { get; set; }

        public int Compare(Object? x, Object? y)
        {
            Employee01 x1 = (Employee01)x;
            Employee01 y1 = (Employee01)y;
            if(x1.DeptNo > y1.DeptNo) {
                return 1;
            } else if(x1.DeptNo > y1.DeptNo) {
                return -1;
            } else {
                return 0;
            }
        }

        public override string ToString()
        {
            return $"Employee [EmpNo={EmpNo} Name={Name}, DeptNo={DeptNo}, Basic={Basic}]";
        }

    }

    public class SortBasic : IComparer<Employee01>
    {
        public int Compare(Employee01? x, Employee01? y)
        {
            if(x.Basic > y.Basic) {
                return 1;
            } else if(x.Basic < y.Basic) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    public class SortEmpNo : IComparer<Employee01>
    {
        public int Compare(Employee01? x, Employee01? y)
        {
            if(x.EmpNo > y.EmpNo) {
                return 1;
            } else if(x.EmpNo < y.EmpNo) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    public class Tester
    {
        public static void Main1()
        // public static void Main()
        {

            Employee01[] emp01 = new Employee01[5];
            emp01[0] = new Employee01 { EmpNo = 5, Name = "Junaid", Basic = 12335, DeptNo = 10 };
            emp01[1] = new Employee01 { EmpNo = 2, Name = "Abhi", Basic = 22335, DeptNo = 20 };
            emp01[2] = new Employee01 { EmpNo = 1, Name = "Avni", Basic = 52335, DeptNo = 20 };
            emp01[3] = new Employee01 { EmpNo = 4, Name = "Shiti", Basic = 32335, DeptNo = 30 };
            emp01[4] = new Employee01 { EmpNo = 3, Name = "Suruchi", Basic = 42335, DeptNo = 40 };

            Array.Sort(emp01, new SortBasic());
            System.Console.WriteLine("@@@@@@@ SORT BY BASIC @@@@@@@@");
            foreach (Employee01 e in emp01)
            {
                System.Console.WriteLine(e);
            }

            Array.Sort(emp01, new SortEmpNo());
            System.Console.WriteLine("@@@@@@@ SORT BY EMP NO @@@@@@@@");
            foreach (Employee01 e in emp01)
            {
                System.Console.WriteLine(e);
            }

            Array.Sort(emp01, new Employee01());
            System.Console.WriteLine("@@@@@@@ SORT BY DEPT NO @@@@@@@@");
            foreach (Employee01 e in emp01)
            {
                System.Console.WriteLine(e);
            }
        }
    }
}

namespace n2
{
    public class Employee02 : IComparable<Employee02>
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }
        public decimal Basic { get; set; }
        public short DeptNo { get; set; }

        public int CompareTo(Employee02? other)
        {
            if(this.Basic > other.Basic) {
                return 1;
            } else if(this.Basic < other.Basic) {
                return -1;
            } else {
                return 0;
            }
        }
        public override string ToString()
        {
            return $"Employee [EmpNo={EmpNo} Name={Name}, DeptNo={DeptNo}, Basic={Basic}]";
        }
    }

    public class Tester
    {
        public static void Main()
        {
            Employee02[] emp02 = new Employee02[5];
            emp02[0] = new Employee02 { EmpNo = 5, Name = "Junaid", Basic = 12335, DeptNo = 10 };
            emp02[1] = new Employee02 { EmpNo = 2, Name = "Abhi", Basic = 22335, DeptNo = 20 };
            emp02[2] = new Employee02 { EmpNo = 1, Name = "Avni", Basic = 52335, DeptNo = 20 };
            emp02[3] = new Employee02 { EmpNo = 4, Name = "Shiti", Basic = 32335, DeptNo = 30 };
            emp02[4] = new Employee02 { EmpNo = 3, Name = "Suruchi", Basic = 42335, DeptNo = 40 };


            Array.Sort(emp02);
            System.Console.WriteLine("@@@@@@@ SORT BY BASIC @@@@@@@@");
            foreach (Employee02 e in emp02)
            {
                System.Console.WriteLine(e);
            }
        }
    }
}