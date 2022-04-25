public class PhoneNumber {
    private String number;
    PhoneNumberType type;

    public PhoneNumber() {

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public PhoneNumberType getType() {
        return type;
    }

    public void setType(PhoneNumberType type) {
        this.type = type;
    }

    public PhoneNumber(String number, PhoneNumberType type) {
        this.number = number;
        this.type = type;
    }
}
