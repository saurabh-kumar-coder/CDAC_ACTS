namespace n1
{
    public interface IDbFunctions
    {
        void Insert();
        void Update();
        void Delete();
    }
    public abstract class Employee : IDbFunctions
    {
        private String name;
        public String Name { get { return name; } set { this.name = value == "" ? "invalid input" : value; } }

        private static int empNoCounter = 0;
        private int empNo;
        public int EmpNo { get { return empNo; } }
        private short deptNo;
        public short DeptNo { get { return this.deptNo; } set { this.deptNo = (short)(value == 0 ? 1 : value); } }
        // abstract property
        public abstract decimal Basic { get; set; }
        // constructor
        public Employee(String name = "ABC", short deptNo = 1)
        {
            this.empNo = ++empNoCounter;
            this.Name = name;
            this.DeptNo = deptNo;
        }
        // abstract method
        public abstract decimal CalcNetSalary();
        public abstract void Insert();
        public abstract void Update();
        public abstract void Delete();
    }

    public class Manager : Employee
    {
        private decimal basic;
        public override decimal Basic
        {
            get
            {
                return basic;
            }
            set
            {
                this.basic = value == 0.0M ? 1000 : value;
            }
        }
        private String designation;
        public String Designation
        {
            get
            {
                return designation;
            }

            set
            {
                this.designation = value == "" || value == null ? "Associate" : value;
            }
        }
        // ctor
        public Manager(String designation = "Associate", decimal basic = 1000, String name = "ABC", short deptNo = 1) : base(name, deptNo)
        {
            this.Designation = designation;
            this.Basic = basic;
            // this.Name = name;
            // this.DeptNo = deptNo;
        }
        // ToString
        public override string ToString()
        {
            return $"MANAGER [EmpNo={EmpNo}, Name={Name}, DeptNo={DeptNo}, Basic={Basic}, Designation={Designation}, NetSalary={CalcNetSalary()}]";
        }
        public override decimal CalcNetSalary()
        {
            return this.Basic * 1.5M;
        }

        public override void Insert()
        {
            System.Console.WriteLine("MANAGER : INSERT");
            return;
        }

        public override void Update()
        {
            System.Console.WriteLine("MANAGER : UPDATE");
            return;
        }

        public override void Delete()
        {
            System.Console.WriteLine("MANAGER : DELETE");
            return;
        }
    }

    public class GeneralManager : Manager
    {
        private String perks;
        public string Perks { get; set; }
        // ctor
        public GeneralManager(String perks = "Holiday Gift", String designation = "Associate", decimal basic = 1000, String name = "ABC", short deptNo = 1) : base(designation, basic, name, deptNo)
        {
            this.Perks = perks;
        }
        // ToString
        public override string ToString()
        {
            return $"GENERAL MANAGER [EmpNo={EmpNo}, Perks={Perks}, Name={Name}, DeptNo={DeptNo}, Basic={Basic}, NetSalary={CalcNetSalary()}]";
        }
        public override decimal CalcNetSalary()
        {
            return this.Basic * 2.0M;
        }

        public override void Insert()
        {
            System.Console.WriteLine("GENERAL MANAGER : INSERT");
            return;
        }

        public override void Update()
        {
            System.Console.WriteLine("GENERAL MANAGER : UPDATE");
            return;
        }

        public override void Delete()
        {
            System.Console.WriteLine("GENERAL MANAGER : DELETE");
            return;
        }

    }

    public class CEO : Employee
    {
        private decimal basic;
        public override decimal Basic
        {
            get
            {
                return basic;
            }
            set
            {
                this.basic = value == 0.0M ? 1000 : value;
            }
        }
        // ctor
        public CEO(decimal basic = 1000, String name = "ABC", short deptNo = 1) : base(name, deptNo)
        {
            this.Basic = basic;
        }
        public override string ToString()
        {
            return $"CEO [EmpNo={EmpNo}, Name={Name}, DeptNo={DeptNo}, Basic={Basic}, NetSalary={CalcNetSalary()}]";
        }
        public sealed override decimal CalcNetSalary()
        {
            return this.Basic * 3.0M;
        }

        public override void Delete()
        {
            System.Console.WriteLine("CEO : DELETE");
            return;
        }

        public override void Insert()
        {
            System.Console.WriteLine("CEO : INSERT");
            return;
        }

        public override void Update()
        {
            System.Console.WriteLine("CEO : UPDATE");
            return;
        }
    }

    public class Tester
    {
        public static void Main()
        {
            Employee employee = new Manager("Manager", 30000, "Saurabh", 5);
            System.Console.WriteLine(employee);

            employee = new GeneralManager("Holiday Gift", "General Manager", 40000, "Rohit", 3);
            System.Console.WriteLine(employee);

            employee = new CEO(50000, "Gaurav", 2);
            System.Console.WriteLine(employee);
        }
    }
}