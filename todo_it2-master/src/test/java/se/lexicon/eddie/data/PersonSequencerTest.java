package se.lexicon.eddie.data;



import static org.junit.Assert.*;
import org.junit.Test;



public class PersonSequencerTest {

    @Test
    public void test_nextPersonId() {
        int currentId = 0;
        int expectedId = 1;
        PersonSequencer sequencer = new PersonSequencer();
        assertEquals(expectedId, sequencer.nextPersonId());
    }

    @Test
    public void test_reset() {
        int expectedId = 0;
        PersonSequencer sequencer = new PersonSequencer();
        assertEquals(expectedId, sequencer.reset());
    }
}
