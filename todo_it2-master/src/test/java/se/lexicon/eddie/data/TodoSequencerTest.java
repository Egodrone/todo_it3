package se.lexicon.eddie.data;



import static org.junit.Assert.*;

import org.junit.Test;

public class TodoSequencerTest {
    @Test
    public void test_nextPersonId_Todo() {
        int currentId = 220;
        int expectedId = 221;
        TodoSequencer todoSequencer = new TodoSequencer();
        assertEquals(expectedId, todoSequencer.nextPersonIdTodo(currentId));
    }

    @Test
    public void test_reset_Todo() {
        int expectedId = 0;
        TodoSequencer todoSequencer = new TodoSequencer();
        assertEquals(expectedId, todoSequencer.resetTodo());
    }
}
