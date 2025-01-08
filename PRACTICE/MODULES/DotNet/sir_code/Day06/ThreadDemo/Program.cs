namespace threadDemo01
{
    public class ThreadDemo01
    {
        public static void Func1()
        {
            for (int i = 0; i < 1000; i++)
            {
                System.Console.WriteLine("func1 ---- : " + i);
            }
        }
        public static void Func2()
        {
            for (int i = 0; i < 1000; i++)
            {
                System.Console.WriteLine("func2 @@@@ : " + i);
            }
        }
        public static void Main1()
        {
            Thread t1 = new Thread(new ThreadStart(Func1));
            Thread t2 = new Thread(Func2);

            t1.Start();
            t2.Start();

            for (int i = 0; i < 10; i++)
            {
                System.Console.WriteLine("Main : " + i);
            }

        }
        public static void Main2()
        {
            // run func1 and func2 till 1000 abd then see the output
            Thread t1 = new Thread(new ThreadStart(Func1));
            Thread t2 = new Thread(Func2);

            t1.IsBackground = true;
            t2.IsBackground = true;

            t1.Start();
            t2.Start();

            for (int i = 0; i < 1; i++)
            {
                System.Console.WriteLine("Main : " + i);
            }
        }

        public static void Main3()
        {
            // run func1 and func2 till 1000 abd then see the output
            Thread t1 = new Thread(new ThreadStart(Func1));
            Thread t2 = new Thread(Func2);

            t1.Start();
            t2.Start();

            for (int i = 0; i < 1; i++)
            {
                System.Console.WriteLine("Main : " + i);
            }

            t1.Join();  // wait for thread to get over
            System.Console.WriteLine("Waiting for T1 to get over");
        }
        public static void Main4()
        {
            AutoResetEvent are = new AutoResetEvent(false);
            Thread t1 = new Thread(delegate ()
            {
                for (int i = 0; i < 200; i++)
                {
                    Console.WriteLine("f1:" + i);
                    if (i % 50 == 0)
                    {
                        //instead of Suspend, use this
                        Console.WriteLine("waiting");
                        are.WaitOne();
                    }
                }
            });

            t1.Start();

            Thread.Sleep(5000);
            //Console.ReadLine();
            Console.WriteLine("resuming 1....");
            are.Set();

            Thread.Sleep(5000);
            System.Console.WriteLine("resuming 2....");
            are.Set();

            Thread.Sleep(5000);
            System.Console.WriteLine("resuming 3....");
            are.Set();

            Thread.Sleep(5000);
            System.Console.WriteLine("resuming 4....");
            are.Set();
        }
    }
}
namespace threadDemo02
{
    public class ThreadDemo02
    {
        public static void Func1(Object obj)
        {
            if (obj == null)
            {
                System.Console.WriteLine("List object is null.");
                return;
            }
            List<int> list = (List<int>)obj;
            System.Console.WriteLine(list[0]);
            System.Console.WriteLine(list[1]);
            for (int i = 0; i < 10; i++)
            {
                System.Console.WriteLine("func1 : " + i);
            }
        }

        public static void Func2(Object obj)
        {
            for (int i = 0; i < 10; i++)
            {
                System.Console.WriteLine("func2 : " + i);
            }
        }
        //to pass multiple parameters
        //1. ValueTuple
        //2. pass an array/collection - if similar data types for parameters
        //3. create a class or struct - pass obj of class/struct
        //4. write an local function/anon method /lambda- no need to pass any parameters, anon method can access
        //local variables in the calling code.
        public static void Main()
        {
            Thread t1 = new Thread(new ParameterizedThreadStart(Func1!));
            Thread t2 = new Thread(Func2!);

            List<int> list = new List<int>();
            list.Add(1);
            list.Add(2);

            t1.Start();
            t2.Start();

            for (int i = 0; i < 10; i++)
            {
                System.Console.WriteLine("Main : " + i);
            }
        }

    }
}