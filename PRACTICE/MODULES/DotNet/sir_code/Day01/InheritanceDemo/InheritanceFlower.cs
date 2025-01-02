namespace flower
{
    public class Flower {
        public string fragrance { get; set; } 
        private string leaves { get; set; }
        public Flower() {
            fragrance = "sweet";
            leaves = "green";
            System.Console.WriteLine(fragrance + " -> " + leaves);
        }
        public Flower(string fragrance) 
        {
            fragrance = "sweet smell";
            System.Console.WriteLine(fragrance);
        }
        public Flower(string fragrance, string leaves) 
        {
            fragrance = "sweet smell";
            leaves = "green leaves";
            System.Console.WriteLine(fragrance + " -> " + leaves);
        }
    }

    public class Rose : Flower {
        public string color { get; set; }
        public Rose() {
            color = "red";
            System.Console.WriteLine("default : " + color);
        }
        public Rose(string color) {
            color = "pink";
            System.Console.WriteLine(color);
        }
        public Rose(string fragrance, string color) : base(fragrance ) {
            fragrance = "very sweet";
            color = "pink";
            System.Console.WriteLine(fragrance + " -> " + color);
        }
    }
}