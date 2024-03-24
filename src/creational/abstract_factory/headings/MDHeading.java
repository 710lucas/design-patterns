package creational.abstract_factory.headings;

public class MDHeading implements Heading{

    private final int MAX_HEADING_LEVEL = 4;
    private final int MIN_HEADING_LEVEL = 1;

    private String text;
    private int headingLevel;

    @Override
    public String getHeading() {
        String returnInfo = "";

        for (int i = 0; i<headingLevel; i++)
            returnInfo+="#";
        returnInfo += " " + text;

        return returnInfo;
    }

    public MDHeading(String text, int headingLevel) {
        this.text = text;
        setHeadingLevel(headingLevel);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
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
}
