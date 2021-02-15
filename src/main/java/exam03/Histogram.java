package exam03;

import java.io.BufferedReader;
import java.io.IOException;

public class Histogram {

    public String createHistogram(BufferedReader reader) throws IOException {
        String line;
        String result = null;
        while ((line= reader.readLine())!=null){
            for (int i = 0; i < Integer.parseInt(line); i++) {
                result.concat("*");
            }
            result.concat("\n");
        }
        return result;
    }
}
