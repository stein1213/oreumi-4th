package weeklyquiz3;

public class BusinessContact extends Contact{
    private String company;

    public BusinessContact(String name, String phoneNumber, String company) {
        super(name, phoneNumber);
        this.company = company;
    }

    public void getContact() {
        super.getContact();
        System.out.println(", 회사명: " + company);
    }
}
