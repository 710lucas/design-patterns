package creational.abstract_factory.factories;

import creational.abstract_factory.bold.Bold;
import creational.abstract_factory.headings.Heading;

public interface MarkupFactory {

    public Heading createHeading(String text, int level);

    public Bold createBold(String text);

}
