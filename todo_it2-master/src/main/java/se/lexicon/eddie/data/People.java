package se.lexicon.eddie.data;



import java.util.Arrays;
import se.lexicon.eddie.model.Person;



public class People {
    //Empty array
    private static Person[] personArr = new Person[0];



    //Return the length of the array
    public int size() {
        return personArr.length;
    }



    //Return the array
    public Person[] findAll() {
        return personArr;
    }



    public Person findById(int personId) {
        int checkSize = size();
        Person searchForPerson = new Person();

        if (checkSize > 0 && checkSize - 1 >= personId) {
            //Person is in the array
            searchForPerson = personArr[personId];
        }
        return searchForPerson;
    }



    public Person[] createNewPerson(Person addNewPerson) {
        Person[] returnArray = Arrays.copyOf(personArr, personArr.length + 1);
        returnArray[returnArray.length - 1] = addNewPerson;
        personArr = returnArray;
        return personArr;
    }



    //Remove the person by the id
    public void removePerson(int personProvId) {
        int removeIndex = 0;
        for (int i = 0; i < personArr.length; i++) {
            if(personArr[i].getPersonId() == personProvId) {
                //person id is found, no need to iterate further
                removeIndex = i;
                break;
            }
        }

        // Creating new array to store existing values - person to remove
        Person[] copyArr = new Person[personArr.length - 1];

        for (int i = 0, j = 0; i < personArr.length; i++) {
            if (i == removeIndex) {
                continue;
            }
            copyArr[j++] = personArr[i];
        }
        personArr = copyArr;
    }



    public void clear() {
        //reset the array
        personArr = new Person[0];
    }



}
