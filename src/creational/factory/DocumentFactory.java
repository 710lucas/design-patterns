package creational.factory;

import creational.factory.factories.CNPJFactory;
import creational.factory.factories.CPFFactory;
import creational.factory.factories.UserInfo;

import java.util.Scanner;

public class DocumentFactory {

    public static void main(String[] args){

        Scanner sc =  new Scanner(System.in);
        UserInfo userInfo = null;

        System.out.println("Select the document you want to create: ");
        System.out.println("[1] - CPF");
        System.out.println("[2] - CNPJ");
        System.out.print("> ");

        try{
            int choice = Integer.parseInt(sc.nextLine());
            if(choice != 1 && choice != 2){
                throw new Exception();
            }
            switch (choice) {
                case 1 :
                    userInfo = new CPFFactory();
                    break;
                case 2:
                    userInfo = new CNPJFactory();
                    break;
                default:
                    break;
            }
        } catch (Exception e){
            System.out.println("Document type invalid");
            return;
        }

        if(userInfo != null)
            System.out.println(userInfo.getUserInfo());


    }

}
