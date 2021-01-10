package se.lexicon.eddie.model;



import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;



public class TodoTest {
    private Todo todo1;



    @Test
    public void test_todoBoolean() {
        Todo todoClass = new Todo();
        assertFalse(todoClass.getDone());
    }



    //test of the default description setter
    @Test
    public void test_getDescription() {
        Todo todoClass = new Todo();
        assertNull(todoClass.getDescription());

        //set description
        todoClass.setDescription("New description");
        String expected = "New description";
        assertEquals(expected, todoClass.getDescription());
    }



    @Test
    public void test_id() {
        int todoIdTest = 0;
        int expected = 2;
        Todo todoClass = new Todo(todoIdTest, "test");
        assertEquals(expected,
                todoClass.getTodoId());
    }



    @Test
    public void test_assignee() {
        todo1 = new Todo();
        Person testPerson = new Person("Eddie", "Hello");
        //System.out.println(testPerson.getFirstName() +" "+ todo1.getAssignee().getFirstName());
        //System.out.println(testPerson.getFirstName());
        todo1.setAssignee(testPerson);
        //System.out.println(todo1.getAssignee().getFirstName());
        assertEquals(testPerson.getFirstName(), todo1.getAssignee().getFirstName());
        assertEquals(testPerson.getLastName(), todo1.getAssignee().getLastName());
    }

}
