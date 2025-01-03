namespace interfacesNamespace
{
    public interface IDBFunction
    {
        public static int ram = 5;
        void INSERT();
        void DELETE();
        void UPDATE();
    }

    public interface IFileFunction
    {
        void OPEN();
        void CLOSE();
        void DELETE();
    }

    public class Implementation1 : IDBFunction
    {
        public void display()
        {
            System.Console.WriteLine("RAM : " + IDBFunction.ram);
            System.Console.WriteLine("IDBFunction DISPLAY");
        }
        public void DELETE()
        {
            System.Console.WriteLine("IDBFunction DELETE");
        }

        public void INSERT()
        {
            System.Console.WriteLine("IDBFunction INSERT");
        }

        public void UPDATE()
        {
            System.Console.WriteLine("IDBFunction UPDATE");
        }
    }

    public class Implementation2 : IDBFunction, IFileFunction
    {
        public void display()
        {
            System.Console.WriteLine("IDBFunction DISPLAY");
        }
        void IDBFunction.DELETE()
        {
            System.Console.WriteLine("IDBFunction IDBFunction.DELETE");
        }

        public void INSERT()
        {
            System.Console.WriteLine("IDBFunction INSERT");
        }

        public void UPDATE()
        {
            System.Console.WriteLine("IDBFunction UPDATE");
        }

        public void OPEN()
        {
            System.Console.WriteLine("IFileFunction OPEN");
        }

        public void CLOSE()
        {
            System.Console.WriteLine("IFileFunction CLOSE");
        }

        void IFileFunction.DELETE()
        {
            System.Console.WriteLine("IFileFunction IFileFunction.DELETE");
        }
    }

    public class Tester
    {
        public static void Main()
        {
            Implementation1 impl = new Implementation1();
            impl.display();
            impl.INSERT();
            impl.UPDATE();
            impl.DELETE();

            IDBFunction idbf;
            idbf = impl;
            idbf.INSERT();
            idbf.UPDATE();
            idbf.DELETE();
            // idbf.DISPLAY();  // late binding 

            Implementation2 impl2 = new Implementation2();
            impl2.INSERT();
            impl2.UPDATE();
            ((IFileFunction)impl2).DELETE();
            impl2.display();
            impl2.OPEN();
            impl2.CLOSE();
            ((IDBFunction)impl2).DELETE();

            (impl2 as IDBFunction).INSERT();
            (impl2 as IDBFunction).UPDATE();
            (impl2 as IDBFunction).DELETE();
            (impl2 as IFileFunction).OPEN();
            (impl2 as IFileFunction).CLOSE();
            (impl2 as IFileFunction).DELETE();
        }
    }
}