package objects;
/**
 * Person is a base of humankind.
 * Person is a base of this project.
 *
 * @author user
 */
public class Person {
    /**
     * The real age of a person that is private knowledge
     */
    private int age;
    /**
     * The real First Name of a person that is private knowledge
     */
    private String firstName;

    /**
     * <p>Person(int age, String firstName)</p>
     * Use this to make a Person
     * @param age the real age of a new Person
     * @param firstName the real First Name of a new Person
     */
    public Person(int age, String firstName) {
        setAge(age);
        setFirstName(firstName);
    }

    /**
     * What about getting age?
     * @return the real age value
     */
    public int getAge() {
        return age;
    }

    /**
     * Set age using this!
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Get the first name
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set First Name or I will kill you!
      * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Live long life.
      */
    public void live() {
        if (getAge() < 65) {
            setAge(getAge() + 1);
            System.out.println(getFirstName() + " lives.");
        } else System.out.println(getFirstName() + " has already dead.");
    }
}
