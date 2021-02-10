package week15d03;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostFinderTest {

    @Test
    void findPostsFor() {
        Post p1 = new Post("BTC", LocalDate.of(2021,1,1),"äsdfghasdfghasdfgh","Lali");
        Post p2 = new Post("LTC", LocalDate.of(2021,2,20),"äsdfghasdfghasdfgh","Bela");

        PostFinder pf = new PostFinder(List.of(p1,p2));

        System.out.println(pf.findPostsFor("Lali"));
        System.out.println(pf.findPostsFor("Bela"));
    }
}