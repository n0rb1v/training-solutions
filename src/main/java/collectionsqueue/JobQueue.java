package collectionsqueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class JobQueue {
    public Job dispatchUrgentJob(Deque<Job> jobs) {
        if (jobs.isEmpty()) {
            throw new NoJobException("No job available, get a rest!");
        }
        return jobs.getFirst();
    }

    public Deque<Job> addJobByUrgency(Job... jobs) {
        Deque<Job> result = new ArrayDeque<>();
        for (Job item : jobs) {
            if (item.isUrgent()) {
                result.addFirst(item);
            } else {
                result.addLast(item);
            }
        }
        return result;
    }

    public Job dispatchNotUrgentJob(Deque<Job> jobs) {
        if (jobs.isEmpty()) {
            throw new NoJobException("No job available, get a rest!");
        }
        return jobs.getLast();
    }
}
