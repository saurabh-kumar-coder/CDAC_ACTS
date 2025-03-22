using System.Text;

namespace TypeConversion
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Convert an int to double, double to int, char to int(ASCII value), and string to int using int.Parse() and Convert.ToInt32().

            int a = 23;
            Console.WriteLine(a);
            double d = a;
            Console.WriteLine(d);

            double dd = 23.45;
            Console.WriteLine(dd);
            int aa = (int)dd;

            String s = "2";
            int si = int.Parse(s);
            Console.WriteLine("si : " + si);
            Console.WriteLine(Convert.ToInt32(s));
            
        }
    }
}
