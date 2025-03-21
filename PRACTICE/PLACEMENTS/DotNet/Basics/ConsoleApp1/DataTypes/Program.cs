namespace DataTypes
{
    internal class Program
    {
        // Write a program to declare variables of types int, float, double, bool, char, and string, assign values, and print them.
        static void Main(string[] args)
        {
            int a = 20;
            Console.WriteLine(a);

            char ch = 'a';
            Console.WriteLine(ch);
            Console.WriteLine((int)ch);

            float f = 20.02f;
            Console.WriteLine(f);           // 20.02
            Console.WriteLine((int)f);      // 20

            double d = 10.010101013;
            Console.WriteLine(d);
            Console.WriteLine((float)d);
            Console.WriteLine((int)d);

            bool b = true;
            Console.WriteLine(b);

        }
    }
}
