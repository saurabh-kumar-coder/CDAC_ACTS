using System.Runtime.InteropServices;

namespace AnonymousFunction01
{
    public class SimpleFunctions
    {
        public static double Add(double a, double b)
        {
            return a + b;
        }

        // Subtraction
        public static double Subtract(double a, double b)
        {
            return a - b;
        }

        // Multiplication
        public static double Multiply(double a, double b)
        {
            return a * b;
        }

        // Division
        public static double Divide(double a, double b)
        {
            if (b == 0)
            {
                throw new DivideByZeroException("Cannot divide by zero!");
            }
            return a / b;
        }
    }
    public class AnonymousFunctionUsingActions
    {
        public static void Addition(int a, int b, int c)
        {
            System.Console.WriteLine(a + b + c);
        }
        public static void Subtract(int a, int b)
        {
            System.Console.WriteLine(a - b);
        }
        public static void Multiplication(int a, int b)
        {
            System.Console.WriteLine(a * b);
        }
        public static void Division(int a, int b)
        {
            System.Console.WriteLine(a / b);
        }
        public static void isEven(int a)
        {
            System.Console.WriteLine(a % 2 == 0);
        }
    }

    public class AnonymousFunctionUsingFunc
    {
        public static int Addition(int a, int b, int c)
        {
            return (a + b + c);
        }
        public static int Subtract(int a, int b)
        {
            return (a - b);
        }
        public static int Multiplication(int a, int b)
        {
            return (a * b);
        }
        public static decimal Division(int a, int b)
        {
            return (a / b);
        }

        public static bool isEven(int a)
        {
            return a % 2 == 0;
        }
    }
    public class Tester
    {
        public static void Main()
        {
            // action takes 0 - 16 parameters as a input but is doesnot return any value, i.e. it return void. 
            Action<int, int, int> a1 = AnonymousFunctionUsingActions.Addition;
            a1(2, 5, 6);
            Action<int, int> a2 = AnonymousFunctionUsingActions.Subtract;
            a2(5,1);
            Action<int, int> a3 = AnonymousFunctionUsingActions.Multiplication;
            a3(5,6);
            Action<int, int> a4 = AnonymousFunctionUsingActions.Division;
            a4(10,2);
            Action<int> a5 = AnonymousFunctionUsingActions.isEven;
            a5(45);
            a5(90);

            Func<int, int, int, int> f1 = AnonymousFunctionUsingFunc.Addition;
            System.Console.WriteLine(f1(1,2,3));

            Func<int,int,int> f2 = AnonymousFunctionUsingFunc.Subtract;
            System.Console.WriteLine(f2(70, 50));

            Func<int, int, int> f3 = AnonymousFunctionUsingFunc.Multiplication;
            System.Console.WriteLine(f3(24, 13));

            Func<int, int, decimal> f4 = AnonymousFunctionUsingFunc.Division;
            System.Console.WriteLine(f4(50, 6));

            Func<int, bool> f5 = AnonymousFunctionUsingFunc.isEven;
            System.Console.WriteLine(f5(46));
            System.Console.WriteLine(f5(47));
        }
    }
}