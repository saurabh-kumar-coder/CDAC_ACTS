namespace _1_Addition
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter the numbers");

            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());

            Console.WriteLine(a + b);

            double d = double.Parse(Console.ReadLine());
            Console.WriteLine(a + d);
        }
    }
}
