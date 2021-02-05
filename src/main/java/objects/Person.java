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
     *
     * @return the real age value
     */
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void live() {
        if (getAge() < 65) {
            setAge(getAge() + 1);
            System.out.println(getFirstName() + " lives.");
        } else System.out.println(getFirstName() + " has already dead.");
    }
}
