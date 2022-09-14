public class Contact {

    private String name;
    private String number;

    public Contact (String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }
    public void setName(String input) {
        this.name = input;
    }
    public String getNumber () {
        return number;
    }
    public void setNumber (String input) {
        this.number = input;
    }
}
