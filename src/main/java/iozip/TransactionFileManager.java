package iozip;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class TransactionFileManager {
    public void saveTransactions(Path path, List<Transaction> transactionList) {
        try (ZipOutputStream zos = new ZipOutputStream(new BufferedOutputStream(Files.newOutputStream(path)))){
            for (Transaction item: transactionList){
                zos.putNextEntry(new ZipEntry(Long.toString(item.getId())));
                String s = item.getTime().toString()+"\n"+item.getAccount()+"\n"+Double.toString(item.getAmount());
                zos.write(s.getBytes(StandardCharsets.UTF_8));
                zos.closeEntry();

            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot write zip file.", e);
        }
    }
}
