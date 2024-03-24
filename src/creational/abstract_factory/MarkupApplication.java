package creational.abstract_factory;

import creational.abstract_factory.factories.HTMLFactory;
import creational.abstract_factory.factories.MDFactory;
import creational.abstract_factory.factories.MarkupFactory;

import java.util.Scanner;

public class MarkupApplication {

    public static final int ADD_MD_ELEMENT = 1;
    public static final int ADD_HTML_ELEMENT = 2;

    public static final int ADD_BOLD = 1;
    public static final int ADD_HEADING = 2;

    public static final int LEAVE = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String fullText = "";
        int formatChoice = -1;
        MarkupFactory factory = null;
        HTMLFactory htmlFactory = new HTMLFactory();
        MDFactory mdFactory = new MDFactory();

        while(formatChoice != LEAVE){

            System.out.println("Your current text is:\n");
            System.out.println(fullText+"\n");
            System.out.println("Choose one thing to add: ");
            System.out.printf("[%d] - Add markdown element\n", ADD_MD_ELEMENT);
            System.out.printf("[%d] - Add HTML elemenet\n", ADD_HTML_ELEMENT);
            System.out.printf("[%d] - Leave\n", LEAVE);
            System.out.print("> ");

            try{
                formatChoice = Integer.parseInt(sc.nextLine());
                if(formatChoice != ADD_HTML_ELEMENT && formatChoice != ADD_MD_ELEMENT && formatChoice != LEAVE)
                    throw new Exception();
            } catch(Exception e){
                formatChoice = -1;
                continue;
            }

            switch (formatChoice){
                case ADD_HTML_ELEMENT:
                    factory = htmlFactory;
                    break;
                case ADD_MD_ELEMENT:
                    factory = mdFactory;
                    break;
                default:
                    continue;
            }

            System.out.println("Choose the element you want to add: ");
            System.out.printf("[%d] - Add bold text", ADD_BOLD);
            System.out.printf("[%d] - Add heading", ADD_HEADING);
            System.out.print("> ");

            int elementChoice;

            try{
                elementChoice = Integer.parseInt(sc.nextLine());
                if(elementChoice !=ADD_BOLD && elementChoice != ADD_HEADING)
                    throw new Exception();
            } catch(Exception e){
                elementChoice = -1;
                continue;
            }


            System.out.print("Type the text you wanna add in the element: ");
            String elementText = sc.nextLine();

            switch (elementChoice){
                case ADD_BOLD:
                    fullText += factory.createBold(elementText).getBold()+"\n";
                    break;
                case ADD_HEADING:
                    System.out.print("Type the heading level: ");
                    try{
                        int headingLevel = Integer.parseInt(sc.nextLine());
                        fullText += factory.createHeading(elementText, headingLevel).getHeading() + "\n";
                    } catch (Exception e){
                        continue;
                    }
                    break;
                default:
                    break;
            }
        }

        System.out.println("Finished!");
        System.out.println("Full text:");
        System.out.println(fullText);

        sc.close();

    }

}
