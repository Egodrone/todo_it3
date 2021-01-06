package se.lexicon.eddie.data;



//import se.lexicon.eddie.model.Person;
import se.lexicon.eddie.model.Todo;
import java.util.Arrays;



public class TodoItems {
    private static Todo[] todoArr = new Todo[0];



    //Return the length of the array
    public int size() {
        return todoArr.length;
    }



    //Return the array
    public Todo[] findAll() {
        return todoArr;
    }



    public Todo findById(int id) {
        // Find by the id
        Todo find = new Todo();

        for (int i =0; i < todoArr.length; i++) {
            if (todoArr[i].getTodoId() == id) {
                find = todoArr[i];
            }
        }
        return find;
    }



    public void add(Todo param) {
        Todo[] newArr = Arrays.copyOf(todoArr, todoArr.length + 1);
        newArr[newArr.length - 1] = param;
        todoArr = newArr;
    }



    public void clear() {
        //reset the array
        todoArr = null;
    }

}
