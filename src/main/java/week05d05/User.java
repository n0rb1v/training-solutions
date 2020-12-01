package week05d05;

public class User {
    private String firstName;
    private String lastName;
    private String email;

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        if ((!email.contains("@"))||(!email.contains("."))){
            throw new IllegalArgumentException("hianyos email");
        }
        this.email = email;
    }

    public String getFullName() {
        return firstName+" "+lastName;
    }
}
