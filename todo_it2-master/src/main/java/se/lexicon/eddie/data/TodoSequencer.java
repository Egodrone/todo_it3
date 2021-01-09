package se.lexicon.eddie.data;



public class TodoSequencer {
    private static int personId = 0;

    public static int nextPersonIdTodo() {
        return ++personId;
    }

    static int resetTodo(){
        personId = 0;
        return personId;
    }
}
