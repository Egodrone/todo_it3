package se.lexicon.eddie.data;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import se.lexicon.eddie.model.Person;
import se.lexicon.eddie.data.People;



public class PeopleTest {
    private People people = new People();
    private int personId = 0;
    private Person[] person = new Person[1];
    private Person test1 = new Person();
    private Person test2 = new Person();
    private Person person1 = new Person(0, "Eddie", "Test");
    private Person person2 = new Person(1, "Jocko", "Willink");

    @Before
    public void setup() {
        people = new People();
        Person test7 = new Person();
        test1.getPersonId();
        test1.setFirstName("Eddie");
        test1.setFirstName("Test");
        //test1 = new Person(1, "Eddie", "lastName");
    }

    @Test
    public void test_size() {
        int expectedId = 0;
        Assert.assertEquals(expectedId, people.size());
    }

    @Test
    public void test_clear(){
        /*
        String[] expectedResult = new String[0];
        String[] emptyArray = new String[0];
        // add a person to the array
        String[] result = people.createNewPerson("Jocko", emptyArray);
        //Clear an array to remove the person
        */
        Person[] result = people.createNewPerson(person1);
        people.clear();
        int expectedId = 0;
        Assert.assertEquals(expectedId, people.size());
    }

    @Test
    public void test_createNewPerson(){
        //Creating the same person
        Person[] result = people.createNewPerson(person1);
        Person[] result2 = people.createNewPerson(person1);
        Assert.assertNotEquals(result2, result);
    }

    @Test
    public void test_createNewPerson2(){
        //Creating two different persons
        Person[] result = people.createNewPerson(person1);
        Person[] result2 = people.createNewPerson(person2);
        // They are not equal
        Assert.assertNotEquals(result2, result);
    }

    @Test
    public void test_findAll() {
        // Creating person 1
        //Person[] testPerson = people.createNewPerson(person1);
        //Assert.assertEquals(testPerson, people.findAll());
        String[] testPerson = new String[0];
        Assert.assertEquals(testPerson, people.findAll());
    }


    /*
    // Previous testing on other constructions
    @Test
    public void test_findById(){
        //There is no person registered in the beginning
        //String expectedResult = "No person with that id is in the array";
        //People people = new People();
        //Person person1 = new Person(0, "Eddie", "Test");
        //Person person2 = new Person(1, "Jocko", "Willink");
        //test1.getPersonId();
        //test1.setFirstName("Eddie");
        //test1.setFirstName("Test");
        //Person result;
        Person test1 = new Person(0, "Eddie", "Test");
        // Setting id to 1 to see if there are any in the register
        Person result = people.findById(0);
        Assert.assertEquals(result, test1);
    }*/

    /*
    @Test
    public void test_findAll() {
        String[] testPerson = new String[0];
        Assert.assertEquals(testPerson, people.findAll());
    }

    @Test
    public void test_findById(){
        //There is no person registered in the beginning
        String expectedResult = "No person with that id is in the array";
        People people = new People();
        Person result;
        // Setting id to 1 to see if there are any in the register
        result = people.findById(0);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test_createNewPerson(){
        String[] expectedResult = {"Jocko"};
        String[] emptyArray = new String[0];
        String newPersonToAdd = "Jocko";
        String[] result = people.createNewPerson("Jocko", emptyArray);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test_clear(){
        String[] expectedResult = new String[0];
        String[] emptyArray = new String[0];
        // add a person to the array
        String[] result = people.createNewPerson("Jocko", emptyArray);
        //Clear an array to remove the person
        people.clear();
        //test size to see if the person is removed
        int expectedId = 0;
        Assert.assertEquals(expectedId, people.size());
    }

    @Test
    public void test_removeObject(){
        // add persons to thew array
        String[] emptyArray = new String[0];
        String[] expectedResult = {"Jocko", "Eddie", "Robert"};
        String[] currentArray = {"Jocko", "Eddie", "Robert", "Melvin"};


        //test of the removing Stefan from the array
        currentArray = people.removeObject("Melvin", currentArray);
        //addedNames = people.removeObject("Eddie", addedNames);
        Assert.assertEquals(expectedResult, currentArray);
    }*/

}
