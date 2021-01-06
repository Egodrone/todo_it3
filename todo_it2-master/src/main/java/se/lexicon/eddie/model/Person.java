package se.lexicon.eddie.model;



import se.lexicon.eddie.data.PersonSequencer;



public class Person {
    private final int personId;
    private String firstName;
    private String lastName;

    public Person() {
        this.personId = PersonSequencer.nextPersonId();
    }

    public Person(String firstName, String lastName) {
        this.personId = PersonSequencer.nextPersonId();;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getPersonId() {
        return personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
