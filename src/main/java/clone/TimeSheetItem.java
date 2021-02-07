package clone;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TimeSheetItem {
    private String employee;
    private String project;
    private LocalDateTime from;
    private LocalDateTime to;

    public TimeSheetItem(String employee, String project, LocalDateTime from, LocalDateTime to) {
        this.employee = employee;
        this.project = project;
        this.from = from;
        this.to = to;
    }

    public TimeSheetItem(TimeSheetItem tsi) {
        this.employee = tsi.employee;
        this.project = tsi.project;
        this.from = tsi.from;
        this.to = tsi.to;
    }
    public static TimeSheetItem withDifferentDay(TimeSheetItem tsi, LocalDate date){
        TimeSheetItem newtsi = new TimeSheetItem(tsi);
        newtsi.from = LocalDateTime.of(date,newtsi.from.toLocalTime());
        newtsi.to = LocalDateTime.of(date,newtsi.to.toLocalTime());
        return newtsi;
    }

    public String getEmployee() {
        return employee;
    }

    public String getProject() {
        return project;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }
}
