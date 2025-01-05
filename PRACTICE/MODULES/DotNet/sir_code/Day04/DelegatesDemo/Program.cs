namespace Delegates01
{
    // create a delegate class with same as method with parameter.
    public delegate void noArgumentDelegate();

    public class Class1 
    {
        public static void Main1()
        {
            // create a reference of the delegate class and assign it to the function
            noArgumentDelegate nad = Display;
            // now call the delegate
            nad();
        }
        public static void Display() 
        {
            System.Console.WriteLine("Display");
        }
    }
}