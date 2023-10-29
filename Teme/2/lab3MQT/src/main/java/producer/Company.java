package producer;

public class Company {
    private String company;
    int tradeNumber;
    String registeredName;

    public Company(String company, int tradeNumber, String registeredName) {
        this.company = company;
        this.tradeNumber = tradeNumber;
        this.registeredName = registeredName;
    }

    public String getCompany() {
        return company;
    }

    public int getTradeNumber() {
        return tradeNumber;
    }

    public String getRegisteredName() {
        return registeredName;
    }
}
