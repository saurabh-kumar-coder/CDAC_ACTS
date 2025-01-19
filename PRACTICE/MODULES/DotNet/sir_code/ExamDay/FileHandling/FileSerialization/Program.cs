using System;
using System.IO;
using System.Text.Json;

[Serializable]
class Person
{
    public string Name { get; set; }
    public int Age { get; set; }

    public override string ToString()
    {
        return $"Name: {Name}, Age: {Age}";
    }
}

class FileHandlingDemo
{
    static void Main()
    {
        string filePath = "person.json";

        // Create an object of the Person class
        Person person = new Person { Name = "John Doe", Age = 30 };

        // Write the object to a file
        WriteObjectToFile(filePath, person);

        // Read the object back from the file
        Person retrievedPerson = ReadObjectFromFile(filePath);

        // Display the retrieved object
        Console.WriteLine("Retrieved Object:");
        Console.WriteLine(retrievedPerson);
    }

    // Method to write an object to a file
    static void WriteObjectToFile(string filePath, Person person)
    {
        try
        {
            string json = JsonSerializer.Serialize(person);
            File.WriteAllText(filePath, json);
            Console.WriteLine("Object written to file successfully.");
        }
        catch (Exception ex)
        {
            Console.WriteLine("Error writing object to file: " + ex.Message);
        }
    }

    // Method to read an object from a file
    static Person ReadObjectFromFile(string filePath)
    {
        try
        {
            string json = File.ReadAllText(filePath);
            return JsonSerializer.Deserialize<Person>(json);
        }
        catch (Exception ex)
        {
            Console.WriteLine("Error reading object from file: " + ex.Message);
            return null;
        }
    }
}