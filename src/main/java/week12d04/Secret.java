package week12d04;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Secret {
    private byte[] bytes = new byte[10];

    public void readFile(Path sour, Path dest) {
        try (InputStream is = Files.newInputStream(sour);
             Writer w = Files.newBufferedWriter(dest)) {
            int size;
            while ((size = is.read(bytes)) > 0) {
                String s = decodeData(size);
                System.out.print(s);
                w.write(s);
            }
        } catch (IOException e) {
            throw new IllegalStateException("file hiba", e);
        }
    }

    private String decodeData(int size) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            bytes[i] += 10;
            sb.append((char) bytes[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Secret secret = new Secret();
        secret.readFile(Path.of("secret.dat"),Path.of("unsecret.txt"));
    }
}
