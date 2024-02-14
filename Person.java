import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;
/**
 * A class that represents a person with a full name and an age.
 * @author Alan Ochoa
 * @version 03/02/2020
 */
public class Person
{
    private String name;
    private int age;

    /**
     * Constructor for objects of class Person
     * @param fullName full name of the person
     * @param ageFromBirth the person's age
     * (Precondition: fullName must have a last name with a space between it and the first name)
     * (Precondition: ageFromBirth >= 0)
     */
    public Person(String fullName, int ageFromBirth) throws IllegalArgumentException
    {
        if(fullName.indexOf(" ") == -1){
            throw new IllegalStateException("Please enter a last name with a space seperating it from the first name.");
        }
        name = fullName;
        if(ageFromBirth < 0||ageFromBirth > 150){
            throw new IllegalStateException("Please enter a real age.");
        }
        age = ageFromBirth;
    }

    /**
     * A method that returns the person's name
     * @return the person's name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * A method that returns the person's age
     * @return the person's age
     */
    public int getAge()
    {
        return age;
    }
    
    /**
     * A method that sets the person's name to the inputed one
     * (Precondition: fullName must have a last name with a space between it and the first name)
     * (Postcondition: getAge() >= 0)
     * @param newName the person's new name
     */
    public void setName(String newName)
    {
        try{
            if(newName.indexOf(" ") == -1){
                throw new IllegalStateException("Please enter a last name with a space seperating it from the first name.");
            }
            name = newName;
        }
        catch(IllegalStateException e){
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * A method that sets the person's age to the inputed one
     * @param newAge the person's updated age
     * (Precondition: ageFromBirth >= 0)
     */
    public void setAge(int newAge)
    {
        try{
            if(newAge < 0||newAge > 150){
                throw new IllegalStateException("Please enter a real age.");
            }
            age = newAge;
        }
        catch(IllegalStateException e){
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * An override to the toString method from the object class
     * @return person's name + ":age " + person's age
     */
    public String toString()
    {
        return name + ": age " + age;
    }
}
