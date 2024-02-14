import java.lang.IllegalArgumentException;
/**
 * A class that represents a contact with a full name, an age, a phone number and an email.
 * @author Alan Ochoa
 * @version 03/02/2020
 */
public class Contacts extends Person
{
    long phoneNum;
    String email;
    /**
     * Constructor for objects of class Contacts
     * @param phone the contact's phone number
     * @param fullName full name of the contact
     * @param ageFromBirth the person's age
     * (Precondition: fullName must have a last name with a space between it and the first name)
     * (Precondition: ageFromBirth >= 0)
     * (Precondition: newNum >= 1000000000)
     * (Precondition: newEmail must contain an @)
     */
    public Contacts(String name, int age, long phone) throws IllegalArgumentException
    {
        super(name, age);
        if(phone <= 1000000000){
            throw new IllegalArgumentException("Please enter a real phone number");
        }
        phoneNum = phone;
        int lastPart = name.indexOf(" ");
        String lastNamePart = name.substring(lastPart+1, name.length());;
        if(lastNamePart.length()+1 > 4){
            lastNamePart = name.substring(lastPart + 1, lastPart + 5);
        }
        String firstLetter = name.substring(0, 1);
        email = firstLetter + lastNamePart + "@apcs.edu";
        email = email.toLowerCase();
    }
    
    /**
     * A method to get the contact's phone number
     * @return contact's phone number
     */
    public long getPhoneNumber()
    {
        return phoneNum;
    }
    
    /**
     * A method to get the contact's email
     * @return contact's email
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * A method that sets a new phone number
     * @param newNum the new phone number
     * (Precondition: newNum >= 1000000000)
     * (Postcondition: getPhoneNumber())
     */
    public void setPhoneNumber(long newNum)
    {
        try{
            if(newNum <= 1000000000){
                throw new IllegalStateException("Please enter a real phone number");
            }
            phoneNum = newNum;
        }
        catch(IllegalStateException e){
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * A method that changes the email
     * @param newEmail the new email
     * (Precondition: newEmail must contain an @)
     * (Postcondition: getEmail())
     */
    public void setEmail(String newEmail)
    {
        try{
            if(!(newEmail.contains("@"))){
                throw new IllegalArgumentException("Please enter a legal email.");
            }
            email = newEmail;
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * An override to the toString method from the object class
     * @return person's name + ":age " + person's age + " Email: " + email + " Phone Number: " + phoneNum;
     */
    public String toString()
    {
        return getName() + ": age " + getAge() + " Email: " + email + " Phone Number: " + phoneNum;
    }
}
