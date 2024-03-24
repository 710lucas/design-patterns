package creational.factory.factories;

import creational.factory.documents.CPF;
import creational.factory.documents.Document;

import java.util.Scanner;

public class CPFFactory extends UserInfo{

    @Override
    public Document getUserDocument() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Your CPF: ");
        String CPF = sc.nextLine();

        System.out.print("Your name: ");
        String name = sc.nextLine();

        System.out.print("Your date of birth: ");
        String birthDate = sc.nextLine();

        sc.close();

        return new CPF(name, CPF, birthDate);

    }
}
