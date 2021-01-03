package se.lexicon.eddie.data;



import java.util.Arrays;
import se.lexicon.eddie.data.PersonSequencer;
import se.lexicon.eddie.model.Person;



public class People {
    //Empty array
    private static Person[] person = new Person[0];

    //Return the length of the array
    public int size() {
        return person.length;
    }

    //Return the array
    public Person[] findAll() {
        return person;
    }

    public Person findById(int personId) {
        int checkSize = size();
        Person searchForPerson = new Person();

        if(checkSize > 0 && checkSize - 1 >= personId){
            //Person is in the array
            searchForPerson = person[personId];
        }
        return searchForPerson;
    }

    public static Person[] createNewPerson(Person addNewPerson){
        //PersonSequencer sequencer = new PersonSequencer();
        //int nextId = sequencer.nextPersonId();
        Person[] returnArray = Arrays.copyOf(person, person.length + 1);
        returnArray[returnArray.length - 1] = addNewPerson;
        return returnArray;
    }

    public void clear() {
        //reset the array
        person = new Person[0];
    }


}
