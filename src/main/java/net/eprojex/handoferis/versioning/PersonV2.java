package net.eprojex.handoferis.versioning;

public class PersonV2 {
    private String firstName;

    public PersonV2() {
    }

    public PersonV2(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "NameV2{" +
                "firstName='" + firstName + '\'' +
                '}';
    }
}
