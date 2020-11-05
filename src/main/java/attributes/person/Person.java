package attributes.person;

public class Person {
    private String name;
    private String identificationCard;
    private Address cim;

    public Person(String name, String identificationCard) {
        this.name = name;
        this.identificationCard = identificationCard;
    }

    public String getName() {
        return name;
    }

    public String getIdentificationCard() {
        return identificationCard;
    }

    public String personToString() {
        return name+identificationCard;
    }

    public void correctData(String name, String identificationCard) {
        this.name = name;
        this.identificationCard = identificationCard;
    }

    public Address getCim() {
        return cim;
    }

    public void moveTo(Address cim) {
        this.cim = cim;
    }
}
