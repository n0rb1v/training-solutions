package stringbasic;

public class StringCreator {

    public String createStringForPool() {
        return "Hello";
    }

    public String createStringForHeap() {
        return new String("Hello");
    }
}
