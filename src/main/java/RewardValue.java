public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035; // Conversion from cash to miles
    }

    // Constructor that accepts miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035; // Conversion from miles to cash
    }

    // Method to return cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to return miles value
    public double getMilesValue() {
        return milesValue;
    }
}
