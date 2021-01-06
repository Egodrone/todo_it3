package se.lexicon.eddie.model;



import org.junit.Test;
import static org.junit.Assert.*;



public class TodoTest {

    @Test
    public void test_todoBoolean() {
        int todoIdTest = 0;
        Todo todoClass = new Todo();
        assertFalse(todoClass.getDone());
    }

    //test of the default description setter
    @Test
    public void test_getDescription() {
        Todo todoClass = new Todo();
        assertNull(todoClass.getDescription());
    }

    //test of the default id
    @Test
    public void test_id() {
        int todoIdTest = 11;
        Todo todoClass = new Todo(todoIdTest, "test");
        assertEquals(todoIdTest,
                todoClass.getTodoId());
    }

}
