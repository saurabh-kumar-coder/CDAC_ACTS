using System.ComponentModel.DataAnnotations.Schema;

namespace Delegates02
{
    // create a delegate class with same as method with parameter.
    public delegate void noArgumentDelegate();

    public delegate int DoubleArgumentDelegate(int a, int b);

    public class Class2 
    {
        public static void Main()
        {
            // create a reference of the delegate class and assign it to the function
            noArgumentDelegate nad = Display;
            // now call the delegate
            nad();
            nad = Show;
            nad();

            // double argument delegate
            DoubleArgumentDelegate dag = Addition;
            System.Console.WriteLine("Addition delegate : " + dag(2, 5));

            dag = Subtract;
            System.Console.WriteLine("Subtract delegate : " + dag(5,3));

            // using function calling 

            System.Console.WriteLine("commonOperationOnTwoNumber(Addition, 3, 5) : " + commonOperationOnTwoNumber(Addition, 3, 5));
            System.Console.WriteLine("commonOperationOnTwoNumber(Subtract, 4, 2) : " + commonOperationOnTwoNumber(Subtract, 4, 2));

        }
        public static void Display() 
        {
            System.Console.WriteLine("Display");
        }

        public static void Show() 
        {
            System.Console.WriteLine("Show");
        }

        public static int Addition(int a, int b) 
        {
            return a + b;
        }

        public static int Subtract(int a, int b) 
        {
            return a - b;
        }

        public static int commonOperationOnTwoNumber(DoubleArgumentDelegate doubleArgumentDelegate, int a , int b) 
        {
            return doubleArgumentDelegate(a,b);
        }
    }
}