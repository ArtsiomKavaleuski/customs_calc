package by.koval;

public class Main {
    public static void main(String[] args) {
Calc calc = new Calc();
DataIn data1 = new DataIn(FuelType.PETROL, 1300, 4, 5000, PersonType.PERSON, false, 3.47, 2.97);
DataIn data2 = new DataIn(FuelType.DIESEL, 2500, 2, 9000, PersonType.PERSON, false, 3.47, 2.97);
DataIn data3 = new DataIn(FuelType.DIESEL, 2500, 2, 9000, PersonType.PERSON, true, 3.47, 2.97);
DataIn data4 = new DataIn(FuelType.PETROL, 1300, 4, 5000, PersonType.ORGANIZATION, false, 3.47, 2.97);
        System.out.println(calc.getFinalCost(data1));
        System.out.println(calc.getFinalCost(data1).getCustomFees().getCustomsTariff());
        System.out.println(calc.getFinalCost(data2));
        System.out.println(calc.getFinalCost(data2).getCustomFees().getCustomsTariff());
        System.out.println(calc.getFinalCost(data3));
        System.out.println(calc.getFinalCost(data3).getCustomFees().getCustomsTariff());
        System.out.println(calc.getFinalCost(data4));
        System.out.println(calc.getFinalCost(data4).getCustomFees().getCustomsTariff());

    }
}
