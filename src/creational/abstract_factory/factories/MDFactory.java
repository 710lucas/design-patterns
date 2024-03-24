package creational.abstract_factory.factories;

import creational.abstract_factory.bold.Bold;
import creational.abstract_factory.bold.MDBold;
import creational.abstract_factory.headings.Heading;
import creational.abstract_factory.headings.MDHeading;

public class MDFactory implements MarkupFactory{

    @Override
    public Heading createHeading(String text, int level) {
        return new MDHeading(text, level);
    }

    @Override
    public Bold createBold(String text) {
        return new MDBold(text);
    }
}
