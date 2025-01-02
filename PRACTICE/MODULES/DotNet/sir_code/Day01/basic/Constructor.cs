namespace constructorDemo
{
    public class Constructor 
    {
        public int a;
        public int b;
        public int c;
        
        // this code can be replaced by default constructor
        // public Constructor(int a, int b, int c) {
        //     this.a = a;
        //     this.b = b;
        //     this.c = c;
        // }

        // now you can use default constructor instead of creating one by one
        public Constructor(){}

        public Constructor(int a) {
            System.Console.WriteLine(a);
        }

        public Constructor(int a, int b) {
            System.Console.WriteLine(a + b);
        }

        public Constructor(int a = 0, int b = 0, int c = 0) {
            System.Console.WriteLine(a + b + c);
        }
    } 
}