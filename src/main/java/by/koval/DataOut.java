package by.koval;

public class DataOut {
    FuelType fuelType;
    int engineCapacity;
    int carAge;
    int firstCost;
    PersonType personType;
    Boolean benefit;
    CustomFees customFees;

    public DataOut(DataIn dataIn, CustomFees customFees) {
        this.engineCapacity = dataIn.engineCapacity;
        this.fuelType = dataIn.fuelType;
        this.carAge = dataIn.carAge;
        this.firstCost = dataIn.firstCost;
        this.personType = dataIn.personType;
        this.benefit = dataIn.benefit;
        this.customFees = customFees;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public int getCarAge() {
        return carAge;
    }

    public int getFirstCost() {
        return firstCost;
    }

    public PersonType getPersonType() {
        return personType;
    }

    public Boolean getBenefit() {
        return benefit;
    }

    public CustomFees getCustomFees() {
        return customFees;
    }

    @Override
    public String toString() {
        return "DataOut{" +
                "fuelType=" + fuelType +
                ", engineCapacity=" + engineCapacity +
                ", carAge=" + carAge +
                ", firstCost=" + firstCost +
                ", personType=" + personType +
                ", benefit=" + benefit +
                ", customFees=" + customFees +
                '}';
    }
}
