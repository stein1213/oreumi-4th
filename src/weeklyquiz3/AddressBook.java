package weeklyquiz3;

import java.util.*;

public class AddressBook {
    private static List<Contact> contacts = new ArrayList<Contact>();

    public static void addContacts(Contact contact) {
        contacts.add(contact);
    }

    public static void displayContacts() {
        int count = 0;
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i) == null) {
                count++;
                continue;
            }
            contacts.get(i).getContact();
        }
        if (count == contacts.size()) {
            System.out.println("연락처가 비어있습니다.");
        }
    }

    public static void searchContact(String name) {
        int count = 0;
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                contacts.get(i).getContact();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("연락처를 찾을 수 없습니다.");
        }
    }
}
