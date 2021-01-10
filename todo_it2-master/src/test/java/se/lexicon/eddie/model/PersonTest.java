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
        Person p1 = new Person("New", "Person");
        int expectedResult = 7;
        int actualResult = p1.getPersonId(); //get id from the Person class
        assertEquals(expectedResult, actualResult);
    }



    @Test
    public void test_set_and_get_firstName() {
        // Test following setters
        String personName = "Pablo";
        testAll.setFirstName(personName);
        assertEquals(personName, testAll.getFirstName());
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
        assertEquals("Eddie", testAll.getFirstName());
    }



    @Test
    public void test_lastName() {
        // Test default setter
        assertEquals(null, person.getLastName());
        assertEquals("Test", testAll.getLastName());
    }


}
