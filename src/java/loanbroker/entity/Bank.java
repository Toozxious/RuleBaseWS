package loanbroker.entity;

public class Bank {
    private int id;
    private int maxDuration;
    private int minDuration;
    private int minAge;
    private double minAmount;
    private double maxAmount;
    private boolean convicted;

    public Bank(int id, int maxDuration, int minDuration, int minAge, double minAmount, double maxAmount) {
        this.id = id;
        this.maxDuration = maxDuration;
        this.minDuration = minDuration;
        this.minAge = minAge;
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
    }

    public int getId() {
        return id;
    }

    public int getMaxDuration() {
        return maxDuration;
    }

    public int getMinDuration() {
        return minDuration;
    }

    public int getAge() {
        return minAge;
    }

    public double getMinAmount() {
        return minAmount;
    }

    public double getMaxAmount() {
        return maxAmount;
    }

    public boolean isConvicted() {
        return convicted;
    }
    
    
    
    
}
