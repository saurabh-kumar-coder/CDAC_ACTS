using System.Security.Cryptography.X509Certificates;

namespace localFunctions
{
    class LocalFunction {
        int i = 10;
        public void DoSomething() {
            System.Console.WriteLine(i);
            DoSomething();
            void DoSomething() {
                i = i + 1;
                System.Console.WriteLine(i);
            }
            System.Console.WriteLine(i);
        }
    }
}