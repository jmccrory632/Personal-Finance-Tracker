public class Transaction {

    private String type;
    private String category;
    private String description;
    private double amount;

    public Transaction(String type, String category, String description, double amount) {
        this.type = type;
        this.category = category;
        this.description = description;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return type + " | " + category + " | " + description + " | £" + amount;
    }
}