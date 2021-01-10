package se.lexicon.eddie.data;



import se.lexicon.eddie.model.Person;
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
        todoArr = new Todo[0];
    }



    public Todo[] findByAssignee(int personId) {
        int tmp = 0;
        for (int i = 0; i < todoArr.length; i++) {
            if (todoArr[i].getAssignee().getPersonId() == personId) {
                tmp++;
            }
        }

        Todo[] assigneeArr = new Todo[tmp];
        tmp = 0;
        for (int i = 0; i < todoArr.length; i++) {
            if (todoArr[i].getAssignee().getPersonId() == personId) {
                assigneeArr[tmp] = todoArr[i];
                tmp++;
            }
        }
        return assigneeArr;
    }



    public Todo[] findByAssignee(Person assignee) {
        int tmp = 0;
        for (int i = 0; i < todoArr.length; i++) {
            if (todoArr[i].getAssignee().getPersonId() == assignee.getPersonId()) {
                tmp++;
            }
        }

        Todo[] assigneeArr = new Todo[tmp];
        tmp = 0;
        for (int i = 0; i < todoArr.length; i++) {
            if (todoArr[i].getAssignee().getPersonId() == assignee.getPersonId()) {
                assigneeArr[tmp] = todoArr[i];
                tmp++;
            }
        }
        return assigneeArr;
    }



    public Todo[] findUnassignedTodoItems() {
        int tmp = 0;
        for (int i = 0; i < todoArr.length; i++) {
            if (todoArr[i].getAssignee() == null) {
                tmp++;
            }
        }

        Todo[] assigneeNotSet = new Todo[tmp];
        tmp = 0;
        for (int i = 0; i < todoArr.length; i++) {
            if (todoArr[i].getAssignee() == null) {
                assigneeNotSet[tmp] = todoArr[i];
                tmp++;
            }
        }
        return assigneeNotSet;
    }



    public Todo[] findByDoneStatus(boolean doneStatus) {
        int done, notDone, a, b;
        done = notDone = a = b = 0;

        for (int i = 0; i < todoArr.length; i++) {
            if (todoArr[i].getDone() == true) {
                done++;
            } else {
                notDone++;
            }
        }
        Todo[] doneArr = new Todo[done];
        Todo[] notDoneArr = new Todo[notDone];

        for (int i = 0; i < todoArr.length; i++) {
            if (todoArr[i].getDone() == true && done != 0) {
                doneArr[a] = todoArr[i];
                a++;
                done--;
            } else {
                if (notDone != 0) {
                    notDoneArr[b] = todoArr[i];
                    b++;
                    notDone--;
                }
            }
        }

        if (doneStatus == true) {
            return doneArr;
        }
        return notDoneArr;
    }



    public void removeTodo(int personId) {
        int tmp = 0;
        for (int i = 0; i < todoArr.length; i++) {
            if (todoArr[i].getTodoId() == personId) {
                tmp = i;
                break;
            }
        }
        Todo[] newArr = new Todo[todoArr.length - 1];

        for(int i = 0, j = 0; i < todoArr.length; i++) {
            if (i == tmp) {
                continue;
            }
            newArr[j++] = todoArr[i];
        }
        todoArr = newArr;
    }

}
