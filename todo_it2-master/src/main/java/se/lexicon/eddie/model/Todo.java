package se.lexicon.eddie.model;



import se.lexicon.eddie.data.TodoSequencer;



public class Todo {
    private final int todoId;
    private String description;
    private boolean done;
    private Person assignee;

    public Todo(int todoId, String description) {
        this.todoId = TodoSequencer.nextPersonIdTodo();
        this.description = description;
    }

    public Todo() {
        todoId = TodoSequencer.nextPersonIdTodo();
    }

    public int getTodoId() {
        return todoId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }
}
