namespace StaticMembers;

class Program
{
    static void Main(string[] args)
    {
        StaticClass.StringDataType.Length = 10;
        Console.WriteLine(StaticClass.StringDataType.Length);
    }
}

// static class doesnot require constructor or destructor
// instance cannot be created of the static class
// static class cannot become a base class of any other class