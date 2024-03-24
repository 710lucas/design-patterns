package creational.abstract_factory.bold;

public class MDBold implements Bold{

    private String text;

    @Override
    public String getBold() {
        return "**"+text+"**";
    }

    public MDBold(String text){
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
