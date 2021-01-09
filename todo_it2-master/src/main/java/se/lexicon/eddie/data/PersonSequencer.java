package se.lexicon.eddie.data;



public class PersonSequencer {
    private static int personId = 0;

    public static int nextPersonId() {
        return ++personId;
    }

    static int reset(){
        personId = 0;
        return personId;
    }
}