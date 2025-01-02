namespace inheritance
{
    public class Tester 
    {
        public static void Main()
        {
            Animal a = new Animal();
            a.eat = "food";

            Dog d = new Dog();
            d.eat = "dog food";
            d.bark = "bhaw bhaww..";


            flower.Flower f =new flower.Flower("fragrance is sweet");
            // f.fragrance = "fragrance is sweet";
            flower.Rose r = new flower.Rose("A", "B");
            // r.color = "red";
            // r.fragrance = "sweets";
            System.Console.WriteLine(f.fragrance);
            System.Console.WriteLine(r.color);
            System.Console.WriteLine(r.fragrance);
        }
    }

    public class Animal 
    {
        public string eat;
    }
    public class Dog : Animal 
    {
        public string bark;
    }
}