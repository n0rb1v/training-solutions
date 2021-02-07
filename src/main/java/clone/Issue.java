package clone;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Issue {
    private String name;
    private LocalDateTime time;
    private Status status;
    private List<Comment> comments = new ArrayList<>();

    public Issue(Issue o, CopyMode cp) {
        this.name = o.name;
        this.time = o.time;
        this.status = o.status;
        if (cp.equals(CopyMode.WITH_COMMENTS)){
            List<Comment> tmp = new ArrayList<>();
            for (Comment item: o.comments){
                tmp.add(new Comment(item));
            }
            this.comments = tmp;
        }
    }

    public Issue(String name, LocalDateTime time, Status status) {
        this.name = name;
        this.time = time;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public Status getStatus() {
        return status;
    }

    public List<Comment> getComments() {
        return comments;
    }
}
