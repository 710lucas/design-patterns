package creational.factory.documents;

public class CPF implements Document{

    private String name;
    private String number;
    private String birthDate;

    public CPF(String name, String number, String birthDate) {
        this.name = name;
        this.number = number;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String getData() {
        return "=== CPF ===\n"
                + "Name: " + this.name + "\n"
                + "Number: " + this.number + "\n"
                + "Birthdate: " + this.birthDate + "\n";
    }
}
