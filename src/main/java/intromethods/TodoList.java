package intromethods;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<Todo> todos = new ArrayList<>();

    public void addTodo(String caption) {
        Todo todo = new Todo(caption);
        todos.add(todo);
    }

    public void finishTodos(String caption) {
        for (Todo todo : todos) {
            if (todo.getCaption().equals(caption)) {
                todo.finish();
            }
        }
    }

    public void finishAllTodos(List<String> todosFinish) {
        for (Todo todo : todos) {
            for (String todoFinish : todosFinish)
                if (todo.getCaption().equals(todoFinish)) {
                    todo.finish();
                }
        }
    }

    public List<String> todosToFinish() {
        List<String> toFinish = new ArrayList<>();
        for (Todo todo : todos) {
            if (todo.isFinished() == false) {
                toFinish.add(todo.getCaption());
            }
        }
        return toFinish;
    }

    public int numberOfFinishedTodos() {
        int sum = 0;
        for (Todo todo : todos) {
            if (todo.isFinished()) {
                sum++;
            }
        }
        return sum;
    }

    @Override
    public String toString() {
        return todos.toString();
    }
}
