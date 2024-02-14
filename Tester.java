
public class Tester
{
    public static void main(String[] args){
        //me
        System.out.println("Me:");
        Person me = new Person("Alan Ocoa", 130);
        System.out.println(me.getName());
        System.out.println(me.getAge());
        
        me.setName("Alan Ochoa");
        me.setAge(17);
        
        System.out.println(me.getName());
        System.out.println(me.getAge());
        System.out.println(me);
        
        System.out.println();
        //bob
        System.out.println("Bob:");
        Contacts bob = new Contacts("Bob Li", 40, 1111111111);
        System.out.println(bob.getName());
        System.out.println(bob.getAge());
        System.out.println(bob.getEmail());
        System.out.println(bob.getPhoneNumber());
        
        bob.setName("Bobby Li");
        bob.setAge(41);
        bob.setEmail("bobbylilgmail.com");
        bob.setPhoneNumber(1234567890);

        System.out.println(bob.getName());
        System.out.println(bob.getAge());
        System.out.println(bob.getEmail());
        System.out.println(bob.getPhoneNumber());
        System.out.println(bob);
    }
}

