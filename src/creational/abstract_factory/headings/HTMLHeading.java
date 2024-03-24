package creational.abstract_factory.headings;

public class HTMLHeading implements Heading{

    private final int MAX_HEADING_LEVEL = 4;
    private final int MIN_HEADING_LEVEL = 1;

    private int headingLevel;
    private String text;

    @Override
    public String getHeading() {
        return "<h"+headingLevel+">\n\t"+text+"\n</h"+headingLevel+">";
    }

    public HTMLHeading(String text, int headingLevel) {
        setHeadingLevel(headingLevel);
        this.text = text;
    }

    public int getHeadingLevel() {
        return headingLevel;
    }

    public void setHeadingLevel(int headingLevel) {
        if(headingLevel < MIN_HEADING_LEVEL  || headingLevel > MAX_HEADING_LEVEL)
            throw new RuntimeException("You cannot create a heading below"+MIN_HEADING_LEVEL+" or above "+MAX_HEADING_LEVEL);
        this.headingLevel = headingLevel;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
