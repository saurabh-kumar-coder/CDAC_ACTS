namespace inheritance
{
    public class Base
    {
        public int one { get; set; }
        public String two { get; set; }

        // constructor
        public Base(){}
        public Base(int one, String two)
        {
            this.one = one;
            this.two = two;
        }

        public void func01()
        {
            System.Console.WriteLine("base func01..!!");
        }
        // public void func01(int five)
        // {
        //     System.Console.WriteLine("five : " + five);
        //     System.Console.WriteLine("base func01..!!");
        // }
        // hiding
        public void func02()
        {
            System.Console.WriteLine("base func02..!!");
        }
        // overriding
        public virtual void func03()
        {
            System.Console.WriteLine("base func03..!!");
        }
    }

    public class Derived : Base
    {
        public int three { get; set; }
        public Derived() {}
        public Derived(int three, int one, String two) : base(one, two)
        {
            this.three = three;
        }
        public override String ToString()
        {
            return $"derived => one: {one}, two: {two}, three: {three}";
        }
        public void func01(int five)
        {
            System.Console.WriteLine("five : " + five);
            System.Console.WriteLine("derived func01..!!");
        }
        // hiding base func02
        public new void func02()
        {
            System.Console.WriteLine("derived func02..!!");
        }
        public sealed override void func03()
        {
            System.Console.WriteLine("derived func03..!!");
        }
    }
    public class SubDerived : Derived
    {
        public int four { get; set; }
        public SubDerived(int four, int three, int one, String two) : base(three, one, two)
        {
            this.four = four;
        }
        public override String ToString()
        {
            return $"subderived => one: {one}, two: {two}, three: {three}, four: {four}";
        }
        public void func01(int six, int seven)
        {
            System.Console.WriteLine("six : ", six, ", seven : ", seven);
            System.Console.WriteLine("subderived func01..!!");
        }
        public new void func02()
        {
            System.Console.WriteLine("subderived func02..!!");
        }
        // sealed method cannot be overridden
        // public override void func03()
        // {
        //     System.Console.WriteLine("subderived func03..!!");
        // }
    }
    public class Tester
    {
        public static void Main()
        {

            Base b = new Derived();
            
            b.func01();
            // b.func01(4);
            b.func02();
            b.func03();

            // Derived derived = new Derived(3,1,"two");
            // System.Console.WriteLine(derived);
            // derived.func01();
            // derived.func02();
            // derived.func03();

            // SubDerived subDerived = new SubDerived(4, 3, 1, "two");
            // subDerived.func01();
            // subDerived.func01(5);
            // subDerived.func01(6,7);
            // subDerived.func02();
            // subDerived.func03();
        }
    }
}