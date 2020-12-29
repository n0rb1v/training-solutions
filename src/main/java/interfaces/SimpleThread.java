package interfaces;

import java.util.List;

public class SimpleThread implements Runnable {
    private List<String> tasks;

    public SimpleThread(List<String> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void run() {
        boolean bl = nextStep();
        while (bl == true) {
            bl = nextStep();
        }
    }

    public List<String> getTasks() {
        return tasks;
    }

    private boolean nextStep() {
        int size = tasks.size()-1;
        if (tasks.size() > 0) {
            tasks.remove(size);
        }
        return size > 0 ? true : false;
    }
}
