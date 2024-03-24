package creational.factory.documents;

public class CNPJ implements Document{

    private String number;
    private String name;
    private String incorporationDate;
    private RegistrationStatus registrationStatus;
    private String address;

    public CNPJ(String number, String name, String incorporationDate, RegistrationStatus registrationStatus, String address) {
        this.number = number;
        this.name = name;
        this.incorporationDate = incorporationDate;
        this.registrationStatus = registrationStatus;
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getIncorporationDate() {
        return incorporationDate;
    }

    public void setIncorporationDate(String incorporationDate) {
        this.incorporationDate = incorporationDate;
    }

    public RegistrationStatus getRegistrationStatus() {
        return registrationStatus;
    }

    public void setRegistrationStatus(RegistrationStatus registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getData() {
        return "=== CNPJ ===\n"+
                "Name: " + this.name + "\n"+
                "Number : " + this.number + "\n"+
                "Date of incoporation: " + this.incorporationDate + "\n"+
                "Registration status: " + this.registrationStatus + "\n"+
                "Address: " + this.address + "\n";
    }
}
