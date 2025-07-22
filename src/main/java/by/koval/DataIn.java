package by.koval;

public class DataIn {
    FuelType fuelType;
    int engineCapacity;
    int carAge;
    int firstCost;
    PersonType personType;
    Boolean benefit;
    double curEuro;
    double curDollar;

    public DataIn(FuelType fuelType, int engineCapacity, int carAge, int firstCost, PersonType personType, Boolean benefit, double curEuro, double curDollar) {
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
        this.carAge = carAge;
        this.firstCost = firstCost;
        this.personType = personType;
        this.benefit = benefit;
        this.curEuro = curEuro;
        this.curDollar = curDollar;
    }
}
