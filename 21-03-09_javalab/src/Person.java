/**
 * This class stores a person based on their name and age
 */
public class Person
{
	private String name = "";
    private int age = 0;

    /**
     * Sets the name
     * @param input This is what the name will be set to
     */
    public void setName(String input) { name = input; }

    /**
     * Sets the age
     * @param input This is what the age will be set to
     */
    public void setAge(int input)
    {
        age = input;
    }

    /**
     * Gets the name
     * @return Returns the Name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Gets the age
     * @return Returns the age
     */
    public int getAge()
    {
        return age;
    }

    /**
     * Are the Persons' registries equal?
     * @param targetPerson The Person whos registry you are comparing to
     * @return the answer to the proposed question
     */
    public boolean arePersonsRegistriesEqual (Person targetPerson)
    {
        return (this == targetPerson);
    }

    /**
     * Are the Persons' class data equal?
     * @param targetPerson The Person whos registry you are comparing to
     * @return the answer to the proposed question
     */
    public boolean arePersonsEqual (Person targetPerson)
    {
        return (this.name.equalsIgnoreCase(targetPerson.name)) &&
                (this.age == targetPerson.age);
    }

    /**
     * Are the Persons' names equal?
     * @param targetPerson The Person whos registry you are comparing to
     * @return the answer to the proposed question
     */
    public boolean doPersonsShareName (Person targetPerson)
    {
        return this.name.equalsIgnoreCase(targetPerson.name);
    }


    //testing the code
    public static void main(String[] args) {
        Person jon = new Person();
        jon.setName("Jon Pumpernickle");
        jon.setAge(104);
        System.out.println(jon.getName() + jon.getAge());

        Person jane = new Person();
        jane.setName("Jane Wholewheat");
        jane.setAge(47);
        System.out.println(jane.name + jane.age);

        Person otherJon = new Person();
        otherJon.setName("Jon Pumpernickle");
        otherJon.setAge(104);
        System.out.println(otherJon.getName() + otherJon.getAge());

        System.out.println(jon.arePersonsRegistriesEqual(otherJon));
        System.out.println(jon.arePersonsEqual(otherJon));

        jane.setName("Jon Pumpernickle");
        System.out.println(jon.doPersonsShareName(jane));

    }

}