package creational.factory.factories;

import creational.factory.documents.CNPJ;
import creational.factory.documents.Document;
import creational.factory.documents.RegistrationStatus;

import java.util.Scanner;

public class CNPJFactory extends UserInfo{

    @Override
    public Document getUserDocument() {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Your CNPJ: ");
        String CNPJ = sc.nextLine();

        System.out.printf("Your name: ");
        String name = sc.nextLine();

        System.out.printf("Your date of incorporation: ");
        String incorporationDate = sc.nextLine();

        System.out.printf("Your address: ");
        String address = sc.nextLine();

        RegistrationStatus registrationStatus = RegistrationStatus.PENDING;

        sc.close();

        return new CNPJ(CNPJ, name, incorporationDate, registrationStatus, address);
    }
}
