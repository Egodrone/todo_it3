package se.lexicon.eddie.model;



public class Todo {
    private final int todoId;
    private String description;
    private boolean done = false;
    Person assignee = new Person();

    public Todo(int todoId, String description) {
        this.todoId = todoId;
        this.description = description;
    }

    public Todo(int todoId) {
        this.todoId = todoId;
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
