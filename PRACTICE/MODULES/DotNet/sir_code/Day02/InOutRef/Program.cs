using System.Security.Cryptography.X509Certificates;

namespace InOutRef1
{
    internal class class1
    {
        public static void Main()
        {
            int a = 5, b = 4;
            int x = 12;
            System.Console.WriteLine("a : " + a + " b : " + b);
            Swap(a, b);
            System.Console.WriteLine("a : " + a + " b : " + b);
            Swap(ref a, ref b);
            System.Console.WriteLine("a : " + a + " b : " + b);
            Swap2(out a, out b);
            System.Console.WriteLine("a : " + a + " b : " + b);
            Print(in x);

            Class2 c = new Class2();

            doSomthing1(c);
            System.Console.WriteLine("Main 1 : c.i : " + c.i);
            doSomthing2(c);
            System.Console.WriteLine("Main 2 : c.i : " + c.i);
            doSomthing3(ref c);
            System.Console.WriteLine("Main ref 3 : c.i : " + c.i);
            doSomthing4(out c);
            System.Console.WriteLine("Main out 4 : c.i : " + c.i);
            doSomthing5(in c);
        }

        private static void doSomthing5(in Class2 c)
        {
            System.Console.WriteLine("doSomthing5 in c.i : " + c.i);
        }

        private static void doSomthing4(out Class2 c)
        {
            c = new Class2();
            c.i = 4000;
            System.Console.WriteLine("doSomthing4 out c.i : " + c.i);
        }

        private static void doSomthing3(ref Class2 c)
        {
            c = new Class2();
            c.i = 5000;
            System.Console.WriteLine("doSomthing3 ref c.i : " + c.i);
        }

        private static void doSomthing2(Class2 c)
        {
            c = new Class2();
            System.Console.WriteLine("doSomthing2 c.i : " + c.i);
        }

        // the reference type object attributes/ properties can be updated but reference cannot be changed. 
        private static void doSomthing1(Class2 c)
        {
            c.i = 3000;
            System.Console.WriteLine("doSomthing1 c.i : " + c.i);
        }

        // "in" is used for readonly we cannot re-assign/ change the input data
        private static void Print(in int x)
        {
            // x = 10;
            System.Console.WriteLine("Readonly x is : " + x);
        }

        // "out" is same as ref, the changed value is reflected, 
        // the previous incoming data is/are removed.
        // but the data need to be re-initialized again.
        // re-initialization process is must needed otherwise error is thrown 
        private static void Swap2(out int a, out int b)
        {
            a = 5;
            b = 2;
        }
        // using "ref" value changed in other function reflects in the main function. 
        private static void Swap(ref int a, ref int b)
        {
            int temp = a;
            a = b;
            b = temp;
        }

        private static void Swap(int a, int b)
        {
            int temp = a;
            a = b;
            b = temp;
        }
    }

    public class Class2
    {
        public int i = 10;
    }

}
