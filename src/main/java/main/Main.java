package main;

import objects.Person;

/**
 * Main class exploits people.
 * <img src="../../resources/meme.jpg" alt="Meme about slaves">
 *
 * @author user
 */
public class Main {
    /**
     * it is the main method in the main class
     * @param args is default. Who cares?
     */
    public static void main(String[] args) {
        Person person = new Person(63, "Bob");
        for (int i = 0; i < 5; i++) person.live();
    }
}
