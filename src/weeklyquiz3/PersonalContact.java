package weeklyquiz3;

public class PersonalContact extends Contact{
    private String relationship;

    public PersonalContact(String name, String phoneNumber, String relationship) {
        super(name, phoneNumber);
        this.relationship = relationship;
    }

    public void getContact() {
        super.getContact();
        System.out.println(", 관계: " + relationship);
    }
}
