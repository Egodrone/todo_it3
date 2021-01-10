package se.lexicon.eddie.data;



import org.junit.Before;
import org.junit.Test;
import se.lexicon.eddie.model.Person;
import se.lexicon.eddie.model.Todo;
import static org.junit.Assert.*;



public class TodoItemsTest {
    private Todo[] testOne = new Todo[2];
    private Todo[] testTwo = new Todo[2];
    private Todo todo1 = new Todo();
    private Todo todo2 = new Todo();
    private Person p1 = new Person();
    private Person p2 = new Person();



    @Before
    public void setup() {
        p1.setFirstName("Eddie");
        p1.setLastName("Test");

        //System.out.println(p1.getPersonId());
        p2.setFirstName("Another");
        p2.setLastName("Person");
        //System.out.println(p2.getPersonId());

        todo1.setDescription("Sell Bitcoins");
        todo1.setAssignee(p1);
        todo1.setDone(true);

        todo2.setDescription("Buy Ethereum");
        todo2.setAssignee(p2);
        todo2.setDone(true);

        testOne[0] = todo1;
        testOne[1] = todo2;
    }



    @Test
    public void test_size() {
        TodoItems todoItemsCl = new TodoItems();
        todoItemsCl.add(todo1);
        todoItemsCl.add(todo2);
        int expected = 2;
        assertEquals(expected, todoItemsCl.size());
        todoItemsCl.clear();
    }


    @Test
    public void test_add() {
        TodoItems todoItemsCl = new TodoItems();
        int expected = 0;
        // size is 0 in the beginning
        assertEquals(expected, todoItemsCl.size());
        // add a new task
        expected = 1;
        todoItemsCl.add(todo1);
        assertEquals(expected, todoItemsCl.size());
    }


    @Test
    public void test_remove() {
        TodoItems todoItemsCl = new TodoItems();
        System.out.println(todoItemsCl.size());
        // add another task
        todoItemsCl.add(todo1);
        assertEquals(2, todoItemsCl.size());
        //System.out.println(todoItemsCl.size());
        //remove the task
        todoItemsCl.removeTodo(1);
        //System.out.println(todoItemsCl.size());
        assertEquals(1, todoItemsCl.size());
        //remove another one
        todoItemsCl.removeTodo(2);
        assertEquals(0, todoItemsCl.size());
    }



    @Test
    public void test_clear() {
        TodoItems todoItemsCl = new TodoItems();
        todoItemsCl.add(todo1);
        todoItemsCl.add(todo2);

        assertEquals(2, todoItemsCl.size());
        todoItemsCl.clear();
        assertEquals(0, todoItemsCl.size());
    }



    @Test
    public void test_find_by_assignee() {
        TodoItems todoItemsCl = new TodoItems();
        todoItemsCl.add(todo1);
        todoItemsCl.add(todo2);
        String expected = "Eddie";
        assertEquals(expected, todoItemsCl.findByAssignee(1)[0].getAssignee().getFirstName());
        expected = "Another";
        assertEquals(expected, todoItemsCl.findByAssignee(2)[0].getAssignee().getFirstName());
        todoItemsCl.clear();
    }



    @Test
    public void test_findByAssignee_person() {
        TodoItems todoItemsCl = new TodoItems();
        todoItemsCl.add(todo1);
        todoItemsCl.add(todo2);
        //pass Person 1 as a parameter
        assertEquals("Eddie", todoItemsCl.findByAssignee(p1)[0].getAssignee().getFirstName());
        //Second person
        assertEquals("Another", todoItemsCl.findByAssignee(p2)[0].getAssignee().getFirstName());
    }



    @Test
    public void test_findByDoneStatus() {
        TodoItems todoItemsCl = new TodoItems();
        todoItemsCl.add(todo1);
        todoItemsCl.add(todo2);
        assertEquals(true, todoItemsCl.findByDoneStatus(true)[0].getDone());
        todoItemsCl.clear();
    }



    @Test
    public void test_findAll() {
        TodoItems todoItemsCl = new TodoItems();
        todoItemsCl.add(todo1);
        todoItemsCl.add(todo2);
        assertEquals(2, todoItemsCl.findAll().length);
    }
}
