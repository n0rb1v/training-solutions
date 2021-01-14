package week11d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileSum {
    private List<String> files = new ArrayList<>();

    public boolean isFileValid(String s) {
        return Files.isRegularFile(Path.of(s));
    }

    public int readFile(String s) {
        int number;
        try {
            String content = Files.readString(Path.of(s));
            number = Integer.parseInt(content);
        } catch (IOException e) {
            throw new IllegalStateException("Can not read!");
        }
        return number;
    }

    public void createList() {
        for (int i = 0; i < 99; i++) {
            String fileName = String.format("number%02d.txt",i);
            if (isFileValid(fileName)){
                files.add(fileName);
            }
        }
    }

    public int sumNumbers(){
        int sum = 0;
        createList();
        for (String item: files){
            sum += readFile(item);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new FileSum().sumNumbers());
    }
}
