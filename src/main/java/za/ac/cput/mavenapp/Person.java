package za.ac.cput.mavenapp;

/**
 * @author CURSTIN JADE ROSE_220275408
 * Create class Person
 */
public class Person
{
    private String first_name, last_name;
    
    public Person() {}
    
    public Person(String first_name, String last_name)
    {
        this.first_name = first_name;
        this.last_name = last_name;
    }
    
    public String getFirst_name()
    {
        return first_name;
    }

    public void setFirst_name(String first_name)
    {
        this.first_name = first_name;
    }

    public String getLast_name()
    {
        return last_name;
    }

    public void setLast_name(String last_name)
    {
        this.last_name = last_name;
    }

    @Override
    public String toString()
    {
        return "Person{" + "first_name=" + first_name + 
                ", last_name=" + last_name + '}';
    }
}
