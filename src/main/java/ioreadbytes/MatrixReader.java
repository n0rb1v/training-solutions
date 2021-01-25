package ioreadbytes;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MatrixReader {
    private List<byte[]> myMatrix = new ArrayList<>();

    public List<byte[]> getMyMatrix() {
        return myMatrix;
    }

    public void readBytesAndCreateMatrix(String fileName) {
        Path file = Path.of(fileName);
        try (InputStream is = Files.newInputStream(file)) {
            byte[] buff = new byte[1000];

            int size = 0;
            while ((size = is.read(buff)) > 0){
                myMatrix.add(buff);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't find file!", e);
        }
    }


    public int numberOfColumnsWhereMoreZeros() {
        int nOfCol = 0;
        for (int i = 0; i < 1000; i++) {
            int zeros = 0;
            int ones = 0;
            for (int j = 0; j < myMatrix.size(); j++) {
                if (myMatrix.get(j)[i] == 48){
                    zeros++;
                }else {
                    ones++;
                }
            }
            if (zeros>ones){
                nOfCol++;
            }
        }
        return nOfCol;
    }
}
