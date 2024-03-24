package creational.abstract_factory.factories;

import creational.abstract_factory.bold.Bold;
import creational.abstract_factory.bold.HTMLBold;
import creational.abstract_factory.headings.HTMLHeading;
import creational.abstract_factory.headings.Heading;

public class HTMLFactory implements MarkupFactory{

    @Override
    public Heading createHeading(String text, int level) {
        return new HTMLHeading(text, level);
    }

    @Override
    public Bold createBold(String text) {
        return new HTMLBold(text);
    }
}
