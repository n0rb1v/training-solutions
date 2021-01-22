package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;

public class Index {
    public int countStr(String s, BufferedReader br) {
        int sum = 0;

        try  {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains(s)){
                    sum++;
                }
            }

        } catch (IOException e) {
            throw new IllegalStateException("hibas file", e);
        }
        return sum;
    }
}
