package se.lexicon.eddie.model;



import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;



public class PersonTest {
    private Person person;
    private Person testAll;
    private int personId;

    @Before
    public void setup() {
        person = new Person();
        testAll = new Person("Eddie", "Test");
    }

    @Test
    public void test_person_id() {
        int expectedResult = 1;
        int actualResult = person.getPersonId(); //get id from the Person class
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test_set_and_get_firstName() {
        // Test following setters
        String personName = "Pablo";
        person.setFirstName(personName);
        assertEquals(personName, person.getFirstName());
    }

    @Test
    public void test_set_and_get_lastName() {
        // Test setter and getter fot the lastName
        String personLastName = "Nebutan";  // Define the name
        person.setLastName(personLastName); //set lastname
        assertEquals(personLastName, person.getLastName()); //evaluate
    }

    @Test
    public void test_firstName() {
        // Test default setter
        assertEquals(null, person.getFirstName());
    }

    @Test
    public void test_lastName() {
        // Test default setter
        assertEquals(null, person.getFirstName());
    }

    @Test
    public void test_id() {
        int personId = 1;
        // Test default setter
        assertEquals(personId, person.getPersonId());
    }

}
