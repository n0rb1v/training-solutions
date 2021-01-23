package ioprintwriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SalaryWriter {
    private List<String> names;

    public SalaryWriter(List<String> names) {
        this.names = names;
    }

    private long decideSalary(String name) {
        if (name.contains("Dr")) {
            return 500_000;
        }
        if (name.contains("Mr") || name.contains("Mrs")) {
            return 200_000;
        } else {
            return 100_000;
        }
    }

    public void writeNamesAndSalaries(Path file) {
        try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(file))) {
            for (String item : names) {
                pw.print(item);
                pw.print(": ");
                pw.println(decideSalary(item));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't write file!", e);
        }
    }
}