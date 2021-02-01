package collectionsmap;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class LogParser {
    public static final String SEPARATOR = ":";
    public static final int FIELDS = 3;
    public static final DateTimeFormatter DATEFORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Map<String, List<Entry>> parseLog(String log) {
        try (Scanner scanner = new Scanner(log)) {
            Map<String, List<Entry>> result = new HashMap<>();
            while (scanner.hasNext()) {
                String line = scanner.next();
                String[] tmp = line.split(SEPARATOR);
                if (tmp.length != FIELDS) {
                    throw new IllegalArgumentException("Incorrect log: incorrect number of fields");
                }
                LocalDate ld = parseDate(tmp[1]);
                Entry e = new Entry(tmp[0], ld, tmp[2]);
                putMap(result, e);
            }
            return result;
        }
    }

    private void putMap(Map<String, List<Entry>> elements, Entry entry) {
        if (!elements.containsKey(entry.getIpAddress())) {
            elements.put(entry.getIpAddress(), new ArrayList<>());
        }
        elements.get(entry.getIpAddress()).add(entry);
    }

    private LocalDate parseDate(String s) {
        try {
            return LocalDate.parse(s, DATEFORMAT);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Incorrect log: incorrect date", e);
        }
    }
}
