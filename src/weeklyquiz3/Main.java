package weeklyquiz3;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        int menuNum = 0;
        while (menuNum != 5) {
            System.out.println("1. 비즈니스 연락처 추가");
            System.out.println("2. 개인 연락처 추가");
            System.out.println("3. 연락처 출력");
            System.out.println("4. 연락처 검색");
            System.out.println("5. 종료");

            System.out.println("메뉴를 선택해주세요: ");
            Scanner selectMenu = new Scanner(System.in);
            menuNum = selectMenu.nextInt();

            switch (menuNum) {
                case 1:
                    System.out.println("이름을 입력하세요: ");
                    Scanner addNameBusiness = new Scanner(System.in);
                    String nameBusiness = addNameBusiness.nextLine();

                    System.out.println("전화번호를 입력하세요: ");
                    Scanner addPhoneNumberBusiness = new Scanner(System.in);
                    String phoneNumberBusiness = addPhoneNumberBusiness.nextLine();

                    System.out.println("회사명을 입력하세요: ");
                    Scanner addCompanyBusiness = new Scanner(System.in);
                    String companyBusiness = addCompanyBusiness.nextLine();

                    AddressBook.addContacts(new BusinessContact(nameBusiness, phoneNumberBusiness, companyBusiness));
                    break;

                case 2:
                    System.out.println("이름을 입력하세요: ");
                    Scanner addNamePersonal = new Scanner(System.in);
                    String namePersonal = addNamePersonal.nextLine();

                    System.out.println("전화번호를 입력하세요: ");
                    Scanner addPhoneNumberPersonal = new Scanner(System.in);
                    String phoneNumberPersonal = addPhoneNumberPersonal.nextLine();

                    System.out.println("관계를 입력하세요: ");
                    Scanner addCompanyPersonal = new Scanner(System.in);
                    String companyPersonal = addCompanyPersonal.nextLine();

                    AddressBook.addContacts(new PersonalContact(namePersonal, phoneNumberPersonal, companyPersonal));
                    break;

                case 3:
                    AddressBook.displayContacts();
                    break;

                case 4:
                    System.out.println("검색할 이름을 입력하세요: ");
                    Scanner nameForSearch = new Scanner(System.in);
                    String nameSearch = nameForSearch.nextLine();

                    AddressBook.searchContact(nameSearch);
                    break;

                case 5:
                    break;
            }
        }
    }
}
