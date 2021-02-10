package week15d03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PostFinder {
    private List<Post> postList;

    public PostFinder(List<Post> postList) {
        this.postList = postList;
    }

    public List<Post> findPostsFor(String user) {
        List<Post> result = new ArrayList<>();
        for (Post item : postList) {
            if (!item.getTitle().isEmpty() && !item.getContent().isEmpty()
                    && item.getOwner().equals(user)
                    && item.getPublishedAt().isBefore(LocalDate.now())) {
                result.add(item);
            }
        }
        return result;
    }
}
