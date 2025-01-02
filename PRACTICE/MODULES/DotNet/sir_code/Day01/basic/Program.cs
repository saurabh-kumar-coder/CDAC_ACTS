namespace basic
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
            neighbour.Hello hello = new neighbour.Hello();
            hello.function();
            localFunctions.LocalFunction local = new localFunctions.LocalFunction();
            local.DoSomething();

            System.Console.WriteLine("printing constructors");
            new constructorDemo.Constructor(2);
            new constructorDemo.Constructor(2, 4);
            new constructorDemo.Constructor(2, 4, 3);
            
            constructorDemo.Constructor obj1 = new constructorDemo.Constructor() {a = 3, b = 4, c = 5};

            System.Console.WriteLine("obj1.a : " + obj1.a);
            
        }
    }
}
namespace neighbour
{
    class Hello {
        public void function() {
            Console.WriteLine("neighbour say's : Hello, World!");
        }
    }
}