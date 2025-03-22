namespace _3_CharacterManipulation
{
    internal class Program
    {
        static void Main(string[] args)
        {

            string str = "Hello";

            for (int i = 0; i < str.Length; i++)
            {
                Console.WriteLine((int)str[i]);
            }

            for (int i = 0; i < str.Length; i++)
            {
                Console.Write((int)str[i] > 81 ? str[i].ToString().ToUpper() : str[i].ToString().ToLower());
            }
        }
    }
}
