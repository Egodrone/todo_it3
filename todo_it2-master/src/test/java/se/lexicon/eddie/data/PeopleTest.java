package se.lexicon.eddie.data;



import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import se.lexicon.eddie.model.Person;



public class PeopleTest {
    private final Person[] testArr = new Person[3];
    private final People ppl = new People();
    private final Person one = new Person("Eddie", "One");
    private final Person two = new Person("Test", "Two");
    private final Person three = new Person("TestTest", "Three");


    int runOnce = 1;
    @Before
    public void setup() {
        People ppl = new People();
        ppl.clear();
        if (runOnce == 1) {
            testArr[0] = one;
            testArr[1] = two;
            testArr[2] = three;
            runOnce = 2;
        }
    }



    @Test
    public void test_get() {
        String expected = "Eddie";
        assertEquals(expected, one.getFirstName());

        //test second name
        expected = "Test";
        assertEquals(expected, two.getFirstName());

        //test third name
        expected = "TestTest";
        assertEquals(expected, three.getFirstName());
    }



    @Test
    public void test_get_lastName() {
        String expected = "One";
        assertEquals(expected, one.getLastName());

        //test surname
        expected = "Two";
        assertEquals(expected, two.getLastName());

        //test surname
        expected = "Three";
        assertEquals(expected, three.getLastName());
    }



    @Test
    public void test_size_1() {
        int expected = 0;
        int actual = ppl.size();
        assertEquals(expected, actual);
    }



    @Test
    public void test_add_and_size() {
        //adding Array with a new person:
        ppl.createNewPerson(testArr[0]);
        //check size, should be ++ from 0 to 1
        int expected = 1;
        int actual = ppl.size();
        assertEquals(expected, actual);

        //Test create another person
        ppl.createNewPerson(testArr[1]);

        //test size again
        assertEquals(2, ppl.size());
    }



    @Test
    public void test_reset() {
        //Check original length of the array
        assertEquals(0, ppl.size());
        //Add new people
        ppl.createNewPerson(testArr[0]);
        ppl.createNewPerson(testArr[1]);
        ppl.createNewPerson(testArr[2]);

        //Expecting length of 3
        assertEquals(3, ppl.size());

        //Reset
        ppl.clear();
        //Expecting 0
        assertEquals(0, ppl.size());
    }



    @Test
    public void test_remove() {
        //Add new people
        ppl.createNewPerson(testArr[0]);
        ppl.createNewPerson(testArr[1]);
        ppl.createNewPerson(testArr[2]);

        assertEquals(3, ppl.size());
        //Remove person by id
        ppl.removePerson(2);
        assertEquals(2, ppl.size());

        //Remove one more
        ppl.removePerson(3);
        assertEquals(1, ppl.size());

        //remove the last one
        ppl.removePerson(1);
        assertEquals(0, ppl.size());
    }


    @Test
    public void test_find_by_id() {
        //Add new people
        ppl.createNewPerson(testArr[0]);
        ppl.createNewPerson(testArr[1]);
        ppl.createNewPerson(testArr[2]);

        assertEquals("Eddie", ppl.findById(0).getFirstName());
        assertEquals("Test", ppl.findById(1).getFirstName());
    }


    @Test
    public void test_find_all() {
        People testAll = new People();
        testAll.createNewPerson(one);
        testAll.createNewPerson(two);
        testAll.createNewPerson(three);
        assertEquals(testAll.findAll(), ppl.findAll());
    }


}
