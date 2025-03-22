using System.Text;

namespace _4_StringManipulation
{
    internal class Program
    {
        static void Main(string[] args)
        {

            
            // Print its length.
            
            string str = "Hello World";

            Console.WriteLine(str.Length);

            // Convert it to uppercase.

            Console.WriteLine(str.ToUpper());

            // Reverse the string.
            char[] ch = str.ToCharArray();
            for (int i = 0, j = ch.Length - 1; i < j; i++, j--)
            {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
            }
            //str = new string(ch);
            Console.WriteLine(new String(ch));

            // Count the number of vowels.
            HashSet<Char> set = new HashSet<Char>();
            set.Add('a');
            set.Add('e');
            set.Add('i');
            set.Add('o');
            set.Add('u');

            int counter = 0;
            for(int i = 0; i < str.Length; i++)
            {
                char temp = str[i];
                if(set.Contains(temp))
                {
                    counter++;
                }
            }
            Console.WriteLine(counter);
        }
    }
}
