class Person 
 {
    private String name;
    private int age;
    // Getter for name
    public String getName() 
    {
        return name;
    }
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    // Getter for age
    public int getAge() 
    {
        return age;
    }
    // Setter for age
    public void setAge(int age) 
    {
        if (age >= 0 && age <= 120) 
        {
            this.age = age;
        }
        else 
        {
            System.out.println("Invalid age. Age must be between 0 and 120.");
        }
    }
}

public class encapsulation 
{
    public static void main(String[] args)
    {
        Person person = new Person();
        // Using setter methods to set values
        person.setName("John Doe");
        person.setAge(30);
        // Using getter methods to retrieve values
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        // Trying to set an invalid age
        person.setAge(150);
    }
}
