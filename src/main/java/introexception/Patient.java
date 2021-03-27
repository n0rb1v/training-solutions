package introexception;

public class Patient {
    private String name;
    private String ssn;
    private int yearOfBirth;

    public Patient(String name, String ssn, int yearOfBirth) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("error name");
        }
        this.name = name;
        if (!(new SsnValidator().isValidSsn(ssn))) {
            throw new IllegalArgumentException("error ssn");
        }
        this.ssn = ssn;
        if (yearOfBirth < 1900) {
            throw new IllegalArgumentException("error age");
        }
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return ssn;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
