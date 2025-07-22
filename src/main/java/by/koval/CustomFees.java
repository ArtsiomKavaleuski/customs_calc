package by.koval;

public class CustomFees {
    double customsTariff;
    double utilFee;
    double registrationFee;


    public CustomFees(double customsTariff, double utilFee, double registrationFee) {
        this.customsTariff = customsTariff;
        this.utilFee = utilFee;
        this.registrationFee = registrationFee;
    }

    public double getCustomsTariff() {
        return customsTariff;
    }

    public double getUtilFee() {
        return utilFee;
    }

    public double getRegistrationFee() {
        return registrationFee;
    }

    @Override
    public String toString() {
        return "CustomFees{" +
                "customsTariff=" + customsTariff +
                ", utilFee=" + utilFee +
                ", registrationFee=" + registrationFee +
                '}';
    }
}
