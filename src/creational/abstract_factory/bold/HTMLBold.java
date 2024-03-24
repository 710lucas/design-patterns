package creational.abstract_factory.bold;

public class HTMLBold implements Bold{

    private String text;

    @Override
    public String getBold() {
        return "<b>"+text+"</b>";
    }

    public HTMLBold(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
