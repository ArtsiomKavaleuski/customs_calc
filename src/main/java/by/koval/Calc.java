package by.koval;

public class Calc {
    public static double ratePersonLess3YearsLess8500Euro = 0.54;
    public static double ratePersonLess3YearsMore8500Euro = 0.48;

    public static double rateEnginePersonLess3YearsLess8500Euro = 2.5;
    public static double rateEnginePersonLess3YearsMore8500Less16700Euro = 3.5;
    public static double rateEnginePersonLess3YearsMore16700Less42300Euro = 5.5;
    public static double rateEnginePersonLess3YearsMore42300Less84500Euro = 7.5;
    public static double rateEnginePersonLess3YearsMore84500Less169000Euro = 15;
    public static double rateEnginePersonLess3YearsMore169000Euro = 20.0;

    public static double rateEnginePersonMore3Less5YearsLess1000L = 1.5;
    public static double rateEnginePersonMore3Less5YearsMore1000Less1500L = 1.7;
    public static double rateEnginePersonMore3Less5YearsMore1500Less1800L = 2.5;
    public static double rateEnginePersonMore3Less5YearsMore1800Less2300L = 2.7;
    public static double rateEnginePersonMore3Less5YearsMore2300Less3000L = 3.0;
    public static double rateEnginePersonMore3Less5YearsMore3000L = 3.6;

    public static double rateEnginePersonMore5YearsLess1000L = 3.0;
    public static double rateEnginePersonMore5YearsMore1000Less1500L = 3.2;
    public static double rateEnginePersonMore5YearsMore1500Less1800L = 3.5;
    public static double rateEnginePersonMore5YearsMore1800Less2300L = 4.8;
    public static double rateEnginePersonMore5YearsMore2300Less3000L = 5.0;
    public static double rateEnginePersonMore5YearsMore3000L = 5.7;

    public static double rateOrganizationLess3Years = 0.3;
    public static double rateOrganizationMore3Less5Years = 0.35;

    public static double rateOrganizationLess1000LPetrol = 1.2;
    public static double rateOrganizationMore1000Less1500LPetrol = 1.45;
    public static double rateOrganizationMore1500Less1800LPetrol = 1.5;
    public static double rateOrganizationMore1800Less2300LPetrol = 2.15;
    public static double rateOrganizationMore2300Less3000LPetrol = 2.15;
    public static double rateOrganizationMore3000LPetrol = 2.8;

    public static double rateOrganizationMore5YearsLess1000LPetrol = 2.5;
    public static double rateOrganizationMore5YearsMore1000Less1500LPetrol = 2.7;
    public static double rateOrganizationMore5YearsMore1500Less1800LPetrol = 2.9;
    public static double rateOrganizationMore5YearsMore1800Less2300LPetrol = 4.0;
    public static double rateOrganizationMore5YearsMore2300Less3000LPetrol = 4.0;
    public static double rateOrganizationMore5YearsMore3000LPetrol = 5.8;

    public static double rateOrganizationLess3YearsLess1500LDiesel = 1.45;
    public static double rateOrganizationLess3YearsMore1500Less2500LDiesel = 1.9;
    public static double rateOrganizationLess3YearsMore2500LDiesel = 1.5;

    public static double rateOrganizationMore3Less5YearsLess1500LDiesel = 1.45;
    public static double rateOrganizationMore3Less5YearsMore1500Less2500LDiesel = 2.15;
    public static double rateOrganizationMore3Less5YearsMore2500LDiesel = 2.8;

    public static double rateOrganizationMore5YearsLess1500LDiesel = 2.7;
    public static double rateOrganizationMore5YearsMore1500Less2500LDiesel = 4.0;
    public static double rateOrganizationMore5YearsMore2500LDiesel = 5.8;

    public static int firstAgeCategoryLimit = 3;
    public static int secondAgeCategoryLimit = 5;

    public static int firstCostCategoryLimit = 8500;
    public static int secondCostCategoryLimit = 16700;
    public static int thirdCostCategoryLimit = 42300;
    public static int forthCostCategoryLimit = 84500;
    public static int fifthCostCategoryLimit = 169000;

    public static int firstPetrolCapacityCategoryLimit = 1000;
    public static int secondPetrolCapacityCategoryLimit = 1500;
    public static int thirdPetrolCapacityCategoryLimit = 1800;
    public static int forthPetrolCapacityCategoryLimit = 2300;
    public static int fifthPetrolCapacityCategoryLimit = 3000;

    public static int firstDieselCapacityCategoryLimit = 1500;
    public static int secondDieselCapacityCategoryLimit = 2500;

    public static double utilFeePersonLess3YearsInBYN = 544.5;
    public static double utilFeePersonMore3YearsInBYN = 1089.0;

    public static double utilFeeOrganizationLess3YearsLess1000LInBYN = 6365.57;
    public static double utilFeeOrganizationLess3YearsMore1000Less2000LInBYN = 23575.91;
    public static double utilFeeOrganizationLess3YearsMore2000Less3000LInBYN = 66248.51;
    public static double utilFeeOrganizationLess3YearsMore3000Less3500LInBYN = 76068.86;
    public static double utilFeeOrganizationLess3YearsMore3500LInBYN = 96868.22;
    public static double utilFeeOrganizationMore3YearsLess1000LInBYN = 16249.5;
    public static double utilFeeOrganizationMore3YearsMore1000Less2000LInBYN = 41471.55;
    public static double utilFeeOrganizationMore3YearsMore2000Less3000LInBYN = 100301.81;
    public static double utilFeeOrganizationMore3YearsMore3000Less3500LInBYN = 116459.46;
    public static double utilFeeOrganizationMore3YearsMore3500LInBYN = 127339.56;

    public static double utilFirstEngineCapacityCategory = 1000;
    public static double utilSecondEngineCapacityCategory = 2000;
    public static double utilThreeEngineCapacityCategory = 3000;
    public static double utilFourthEngineCapacityCategory = 3500;

    public static double registrationFeeInBYN = 120.0;

    public static double benefitRate = 0.5;

    public double getUtilFee(PersonType personType, int carAge, int engineCapacity) {
        switch (personType) {
            case PersonType.PERSON:
                if (carAge <= firstAgeCategoryLimit) {
                    return utilFeePersonLess3YearsInBYN;
                } else {
                    return utilFeePersonMore3YearsInBYN;
                }
            case PersonType.ORGANIZATION:
                if (carAge <= firstAgeCategoryLimit) {
                    if (engineCapacity <= utilFirstEngineCapacityCategory) {
                        return utilFeeOrganizationLess3YearsLess1000LInBYN;
                    } else if (engineCapacity <= utilSecondEngineCapacityCategory) {
                        return utilFeeOrganizationLess3YearsMore1000Less2000LInBYN;
                    } else if (engineCapacity <= utilThreeEngineCapacityCategory) {
                        return utilFeeOrganizationLess3YearsMore2000Less3000LInBYN;
                    } else if (engineCapacity <= utilFourthEngineCapacityCategory) {
                        return utilFeeOrganizationLess3YearsMore3000Less3500LInBYN;
                    } else {
                        return utilFeeOrganizationLess3YearsMore3500LInBYN;
                    }
                } else {
                    if (engineCapacity <= utilFirstEngineCapacityCategory) {
                        return utilFeeOrganizationMore3YearsLess1000LInBYN;
                    } else if (engineCapacity <= utilSecondEngineCapacityCategory) {
                        return utilFeeOrganizationMore3YearsMore1000Less2000LInBYN;
                    } else if (engineCapacity <= utilThreeEngineCapacityCategory) {
                        return utilFeeOrganizationMore3YearsMore2000Less3000LInBYN;
                    } else if (engineCapacity <= utilFourthEngineCapacityCategory) {
                        return utilFeeOrganizationMore3YearsMore3000Less3500LInBYN;
                    } else {
                        return utilFeeOrganizationMore3YearsMore3500LInBYN;
                    }
                }
        }
        return -99999;
    }

    public DataOut getFinalCost(DataIn dataIn) {
        switch (dataIn.personType) {
            case PersonType.PERSON -> {
                if (dataIn.carAge < firstAgeCategoryLimit) {
                    if (dataIn.firstCost <= firstCostCategoryLimit) {
                        double case1Tariff = dataIn.firstCost * ratePersonLess3YearsLess8500Euro;
                        double case2Tariff = dataIn.engineCapacity * rateEnginePersonLess3YearsLess8500Euro;
                        double customTariff = Math.max(case1Tariff, case2Tariff);
                        if (dataIn.benefit) customTariff = customTariff * benefitRate;
                        CustomFees customFees = new CustomFees(customTariff,
                                getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                registrationFeeInBYN / dataIn.curEuro);
                        return new DataOut(dataIn, customFees);
                    } else if (dataIn.firstCost < secondCostCategoryLimit) {
                        double case1Tariff = dataIn.firstCost * ratePersonLess3YearsMore8500Euro;
                        double case2Tariff = dataIn.engineCapacity * rateEnginePersonLess3YearsMore8500Less16700Euro;
                        double customTariff = Math.max(case1Tariff, case2Tariff);
                        if (dataIn.benefit) customTariff = customTariff * benefitRate;
                        CustomFees customFees = new CustomFees(customTariff,
                                getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                registrationFeeInBYN / dataIn.curEuro);
                        return new DataOut(dataIn, customFees);
                    } else if (dataIn.firstCost < thirdCostCategoryLimit) {
                        double case1Tariff = dataIn.firstCost * ratePersonLess3YearsMore8500Euro;
                        double case2Tariff = dataIn.engineCapacity * rateEnginePersonLess3YearsMore16700Less42300Euro;
                        double customTariff = Math.max(case1Tariff, case2Tariff);
                        if (dataIn.benefit) customTariff = customTariff * benefitRate;
                        CustomFees customFees = new CustomFees(customTariff,
                                getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                registrationFeeInBYN / dataIn.curEuro);
                        return new DataOut(dataIn, customFees);
                    } else if (dataIn.firstCost < forthCostCategoryLimit) {
                        double case1Tariff = dataIn.firstCost * ratePersonLess3YearsMore8500Euro;
                        double case2Tariff = dataIn.engineCapacity * rateEnginePersonLess3YearsMore42300Less84500Euro;
                        double customTariff = Math.max(case1Tariff, case2Tariff);
                        if (dataIn.benefit) customTariff = customTariff * benefitRate;
                        CustomFees customFees = new CustomFees(customTariff,
                                getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                registrationFeeInBYN / dataIn.curEuro);
                        return new DataOut(dataIn, customFees);
                    } else if (dataIn.firstCost < fifthCostCategoryLimit) {
                        double case1Tariff = dataIn.firstCost * ratePersonLess3YearsMore8500Euro;
                        double case2Tariff = dataIn.engineCapacity * rateEnginePersonLess3YearsMore84500Less169000Euro;
                        double customTariff = Math.max(case1Tariff, case2Tariff);
                        if (dataIn.benefit) customTariff = customTariff * benefitRate;
                        CustomFees customFees = new CustomFees(customTariff,
                                getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                registrationFeeInBYN / dataIn.curEuro);
                        return new DataOut(dataIn, customFees);
                    } else {
                        double case1Tariff = dataIn.firstCost * ratePersonLess3YearsMore8500Euro;
                        double case2Tariff = dataIn.engineCapacity * rateEnginePersonLess3YearsMore169000Euro;
                        double customTariff = Math.max(case1Tariff, case2Tariff);
                        if (dataIn.benefit) customTariff = customTariff * benefitRate;
                        CustomFees customFees = new CustomFees(customTariff,
                                getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                registrationFeeInBYN / dataIn.curEuro);
                        return new DataOut(dataIn, customFees);
                    }
                } else if (dataIn.carAge < secondAgeCategoryLimit) {
                    if (dataIn.engineCapacity <= firstPetrolCapacityCategoryLimit) {
                        double customTariff = dataIn.engineCapacity * rateEnginePersonMore3Less5YearsLess1000L;
                        if (dataIn.benefit) customTariff = customTariff * benefitRate;
                        CustomFees customFees = new CustomFees(customTariff,
                                getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                registrationFeeInBYN / dataIn.curEuro);
                        return new DataOut(dataIn, customFees);
                    } else if (dataIn.engineCapacity <= secondPetrolCapacityCategoryLimit) {
                        double customTariff = dataIn.engineCapacity * rateEnginePersonMore3Less5YearsMore1000Less1500L;
                        if (dataIn.benefit) customTariff = customTariff * benefitRate;
                        CustomFees customFees = new CustomFees(customTariff,
                                getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                registrationFeeInBYN / dataIn.curEuro);
                        return new DataOut(dataIn, customFees);
                    } else if (dataIn.engineCapacity <= thirdPetrolCapacityCategoryLimit) {
                        double customTariff = dataIn.engineCapacity * rateEnginePersonMore3Less5YearsMore1500Less1800L;
                        if (dataIn.benefit) customTariff = customTariff * benefitRate;
                        CustomFees customFees = new CustomFees(customTariff,
                                getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                registrationFeeInBYN / dataIn.curEuro);
                        return new DataOut(dataIn, customFees);
                    } else if (dataIn.engineCapacity <= forthPetrolCapacityCategoryLimit) {
                        double customTariff = dataIn.engineCapacity * rateEnginePersonMore3Less5YearsMore1800Less2300L;
                        if (dataIn.benefit) customTariff = customTariff * benefitRate;
                        CustomFees customFees = new CustomFees(customTariff,
                                getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                registrationFeeInBYN / dataIn.curEuro);
                        return new DataOut(dataIn, customFees);
                    } else if (dataIn.engineCapacity <= fifthPetrolCapacityCategoryLimit) {
                        double customTariff = dataIn.engineCapacity * rateEnginePersonMore3Less5YearsMore2300Less3000L;
                        if (dataIn.benefit) customTariff = customTariff * benefitRate;
                        CustomFees customFees = new CustomFees(customTariff,
                                getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                registrationFeeInBYN / dataIn.curEuro);
                        return new DataOut(dataIn, customFees);
                    } else {
                        double customTariff = dataIn.engineCapacity * rateEnginePersonMore3Less5YearsMore3000L;
                        if (dataIn.benefit) customTariff = customTariff * benefitRate;
                        CustomFees customFees = new CustomFees(customTariff,
                                getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                registrationFeeInBYN / dataIn.curEuro);
                        return new DataOut(dataIn, customFees);
                    }
                } else {
                    if (dataIn.engineCapacity <= firstPetrolCapacityCategoryLimit) {
                        double customTariff = dataIn.engineCapacity * rateEnginePersonMore5YearsLess1000L;
                        if (dataIn.benefit) customTariff = customTariff * benefitRate;
                        CustomFees customFees = new CustomFees(customTariff,
                                getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                registrationFeeInBYN / dataIn.curEuro);
                        return new DataOut(dataIn, customFees);
                    } else if (dataIn.engineCapacity <= secondPetrolCapacityCategoryLimit) {
                        double customTariff = dataIn.engineCapacity * rateEnginePersonMore5YearsMore1000Less1500L;
                        if (dataIn.benefit) customTariff = customTariff * benefitRate;
                        CustomFees customFees = new CustomFees(customTariff,
                                getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                registrationFeeInBYN / dataIn.curEuro);
                        return new DataOut(dataIn, customFees);
                    } else if (dataIn.engineCapacity <= thirdPetrolCapacityCategoryLimit) {
                        double customTariff = dataIn.engineCapacity * rateEnginePersonMore5YearsMore1500Less1800L;
                        if (dataIn.benefit) customTariff = customTariff * benefitRate;
                        CustomFees customFees = new CustomFees(customTariff,
                                getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                registrationFeeInBYN / dataIn.curEuro);
                        return new DataOut(dataIn, customFees);
                    } else if (dataIn.engineCapacity <= forthPetrolCapacityCategoryLimit) {
                        double customTariff = dataIn.engineCapacity * rateEnginePersonMore5YearsMore1800Less2300L;
                        if (dataIn.benefit) customTariff = customTariff * benefitRate;
                        CustomFees customFees = new CustomFees(customTariff,
                                getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                registrationFeeInBYN / dataIn.curEuro);
                        return new DataOut(dataIn, customFees);
                    } else if (dataIn.engineCapacity <= fifthPetrolCapacityCategoryLimit) {
                        double customTariff = dataIn.engineCapacity * rateEnginePersonMore5YearsMore2300Less3000L;
                        if (dataIn.benefit) customTariff = customTariff * benefitRate;
                        CustomFees customFees = new CustomFees(customTariff,
                                getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                registrationFeeInBYN / dataIn.curEuro);
                        return new DataOut(dataIn, customFees);
                    } else {
                        double customTariff = dataIn.engineCapacity * rateEnginePersonMore5YearsMore3000L;
                        if (dataIn.benefit) customTariff = customTariff * benefitRate;
                        CustomFees customFees = new CustomFees(customTariff,
                                getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                registrationFeeInBYN / dataIn.curEuro);
                        return new DataOut(dataIn, customFees);
                    }
                }
            }
            case PersonType.ORGANIZATION -> {
                switch (dataIn.fuelType) {
                    case FuelType.PETROL -> {
                        if (dataIn.carAge < firstAgeCategoryLimit) {
                            if (dataIn.engineCapacity <= firstPetrolCapacityCategoryLimit) {
                                double case1Tariff = dataIn.firstCost * rateOrganizationLess3Years;
                                double case2Tariff = dataIn.engineCapacity * rateOrganizationLess1000LPetrol;
                                double customTariff = Math.max(case1Tariff, case2Tariff);
                                CustomFees customFees = new CustomFees(customTariff,
                                        getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                        registrationFeeInBYN / dataIn.curEuro);
                                return new DataOut(dataIn, customFees);
                            } else if (dataIn.engineCapacity < secondPetrolCapacityCategoryLimit) {
                                double case1Tariff = dataIn.firstCost * rateOrganizationLess3Years;
                                double case2Tariff = dataIn.engineCapacity * rateOrganizationMore1000Less1500LPetrol;
                                double customTariff = Math.max(case1Tariff, case2Tariff);
                                if (!dataIn.benefit) customTariff = customTariff / benefitRate;
                                CustomFees customFees = new CustomFees(customTariff,
                                        getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                        registrationFeeInBYN / dataIn.curEuro);
                                return new DataOut(dataIn, customFees);
                            } else if (dataIn.engineCapacity < thirdPetrolCapacityCategoryLimit) {
                                double case1Tariff = dataIn.firstCost * rateOrganizationLess3Years;
                                double case2Tariff = dataIn.engineCapacity * rateOrganizationMore1500Less1800LPetrol;
                                double customTariff = Math.max(case1Tariff, case2Tariff);
                                if (!dataIn.benefit) customTariff = customTariff / benefitRate;
                                CustomFees customFees = new CustomFees(customTariff,
                                        getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                        registrationFeeInBYN / dataIn.curEuro);
                                return new DataOut(dataIn, customFees);
                            } else if (dataIn.engineCapacity < forthPetrolCapacityCategoryLimit) {
                                double case1Tariff = dataIn.firstCost * rateOrganizationLess3Years;
                                double case2Tariff = dataIn.engineCapacity * rateOrganizationMore1800Less2300LPetrol;
                                double customTariff = Math.max(case1Tariff, case2Tariff);
                                if (!dataIn.benefit) customTariff = customTariff / benefitRate;
                                CustomFees customFees = new CustomFees(customTariff,
                                        getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                        registrationFeeInBYN / dataIn.curEuro);
                                return new DataOut(dataIn, customFees);
                            } else if (dataIn.engineCapacity < fifthPetrolCapacityCategoryLimit) {
                                double case1Tariff = dataIn.firstCost * rateOrganizationLess3Years;
                                double case2Tariff = dataIn.engineCapacity * rateOrganizationMore2300Less3000LPetrol;
                                double customTariff = Math.max(case1Tariff, case2Tariff);
                                if (!dataIn.benefit) customTariff = customTariff / benefitRate;
                                CustomFees customFees = new CustomFees(customTariff,
                                        getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                        registrationFeeInBYN / dataIn.curEuro);
                                return new DataOut(dataIn, customFees);
                            } else {
                                double case1Tariff = dataIn.firstCost * rateOrganizationLess3Years;
                                double case2Tariff = dataIn.engineCapacity * rateOrganizationMore3000LPetrol;
                                double customTariff = Math.max(case1Tariff, case2Tariff);
                                if (!dataIn.benefit) customTariff = customTariff / benefitRate;
                                CustomFees customFees = new CustomFees(customTariff,
                                        getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                        registrationFeeInBYN / dataIn.curEuro);
                                return new DataOut(dataIn, customFees);
                            }
                        } else if (dataIn.carAge < secondAgeCategoryLimit) {
                            if (dataIn.engineCapacity <= firstPetrolCapacityCategoryLimit) {
                                double case1Tariff = dataIn.firstCost * rateOrganizationMore3Less5Years;
                                double case2Tariff = dataIn.engineCapacity * rateOrganizationLess1000LPetrol;
                                double customTariff = Math.max(case1Tariff, case2Tariff);
                                CustomFees customFees = new CustomFees(customTariff,
                                        getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                        registrationFeeInBYN / dataIn.curEuro);
                                return new DataOut(dataIn, customFees);
                            } else if (dataIn.engineCapacity < secondPetrolCapacityCategoryLimit) {
                                double case1Tariff = dataIn.firstCost * rateOrganizationMore3Less5Years;
                                double case2Tariff = dataIn.engineCapacity * rateOrganizationMore1000Less1500LPetrol;
                                double customTariff = Math.max(case1Tariff, case2Tariff);
                                if (!dataIn.benefit) customTariff = customTariff / benefitRate;
                                CustomFees customFees = new CustomFees(customTariff,
                                        getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                        registrationFeeInBYN / dataIn.curEuro);
                                return new DataOut(dataIn, customFees);
                            } else if (dataIn.engineCapacity < thirdPetrolCapacityCategoryLimit) {
                                double case1Tariff = dataIn.firstCost * rateOrganizationMore3Less5Years;
                                double case2Tariff = dataIn.engineCapacity * rateOrganizationMore1500Less1800LPetrol;
                                double customTariff = Math.max(case1Tariff, case2Tariff);
                                if (!dataIn.benefit) customTariff = customTariff / benefitRate;
                                CustomFees customFees = new CustomFees(customTariff,
                                        getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                        registrationFeeInBYN / dataIn.curEuro);
                                return new DataOut(dataIn, customFees);
                            } else if (dataIn.engineCapacity < forthPetrolCapacityCategoryLimit) {
                                double case1Tariff = dataIn.firstCost * rateOrganizationMore3Less5Years;
                                double case2Tariff = dataIn.engineCapacity * rateOrganizationMore1800Less2300LPetrol;
                                double customTariff = Math.max(case1Tariff, case2Tariff);
                                if (!dataIn.benefit) customTariff = customTariff / benefitRate;
                                CustomFees customFees = new CustomFees(customTariff,
                                        getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                        registrationFeeInBYN / dataIn.curEuro);
                                return new DataOut(dataIn, customFees);
                            } else if (dataIn.engineCapacity < fifthPetrolCapacityCategoryLimit) {
                                double case1Tariff = dataIn.firstCost * rateOrganizationMore3Less5Years;
                                double case2Tariff = dataIn.engineCapacity * rateOrganizationMore2300Less3000LPetrol;
                                double customTariff = Math.max(case1Tariff, case2Tariff);
                                if (!dataIn.benefit) customTariff = customTariff / benefitRate;
                                CustomFees customFees = new CustomFees(customTariff,
                                        getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                        registrationFeeInBYN / dataIn.curEuro);
                                return new DataOut(dataIn, customFees);
                            } else {
                                double case1Tariff = dataIn.firstCost * rateOrganizationMore3Less5Years;
                                double case2Tariff = dataIn.engineCapacity * rateOrganizationMore3000LPetrol;
                                double customTariff = Math.max(case1Tariff, case2Tariff);
                                if (!dataIn.benefit) customTariff = customTariff / benefitRate;
                                CustomFees customFees = new CustomFees(customTariff,
                                        getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                        registrationFeeInBYN / dataIn.curEuro);
                                return new DataOut(dataIn, customFees);
                            }
                        } else {
                            if (dataIn.engineCapacity <= firstPetrolCapacityCategoryLimit) {
                                double customTariff = dataIn.engineCapacity * rateOrganizationMore5YearsLess1000LPetrol;
                                CustomFees customFees = new CustomFees(customTariff,
                                        getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                        registrationFeeInBYN / dataIn.curEuro);
                                return new DataOut(dataIn, customFees);
                            } else if (dataIn.engineCapacity < secondPetrolCapacityCategoryLimit) {
                                double customTariff = dataIn.engineCapacity * rateOrganizationMore5YearsMore1000Less1500LPetrol;
                                if (!dataIn.benefit) customTariff = customTariff / benefitRate;
                                CustomFees customFees = new CustomFees(customTariff,
                                        getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                        registrationFeeInBYN / dataIn.curEuro);
                                return new DataOut(dataIn, customFees);
                            } else if (dataIn.engineCapacity < thirdPetrolCapacityCategoryLimit) {
                                double customTariff = dataIn.engineCapacity * rateOrganizationMore5YearsMore1500Less1800LPetrol;
                                if (!dataIn.benefit) customTariff = customTariff / benefitRate;
                                CustomFees customFees = new CustomFees(customTariff,
                                        getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                        registrationFeeInBYN / dataIn.curEuro);
                                return new DataOut(dataIn, customFees);
                            } else if (dataIn.engineCapacity < forthPetrolCapacityCategoryLimit) {
                                double customTariff = dataIn.engineCapacity * rateOrganizationMore5YearsMore1800Less2300LPetrol;
                                if (!dataIn.benefit) customTariff = customTariff / benefitRate;
                                CustomFees customFees = new CustomFees(customTariff,
                                        getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                        registrationFeeInBYN / dataIn.curEuro);
                                return new DataOut(dataIn, customFees);
                            } else if (dataIn.engineCapacity < fifthPetrolCapacityCategoryLimit) {
                                double customTariff = dataIn.engineCapacity * rateOrganizationMore5YearsMore2300Less3000LPetrol;
                                if (!dataIn.benefit) customTariff = customTariff / benefitRate;
                                CustomFees customFees = new CustomFees(customTariff,
                                        getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                        registrationFeeInBYN / dataIn.curEuro);
                                return new DataOut(dataIn, customFees);
                            } else {
                                double customTariff = dataIn.engineCapacity * rateOrganizationMore5YearsMore3000LPetrol;
                                if (!dataIn.benefit) customTariff = customTariff / benefitRate;
                                CustomFees customFees = new CustomFees(customTariff,
                                        getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                        registrationFeeInBYN / dataIn.curEuro);
                                return new DataOut(dataIn, customFees);
                            }
                        }
                    }
                    case FuelType.DIESEL -> {
                        if (dataIn.carAge < firstAgeCategoryLimit) {
                            if (dataIn.engineCapacity <= firstDieselCapacityCategoryLimit) {
                                double case1Tariff = dataIn.firstCost * rateOrganizationLess3Years;
                                double case2Tariff = dataIn.engineCapacity * rateOrganizationLess3YearsLess1500LDiesel;
                                double customTariff = Math.max(case1Tariff, case2Tariff);
                                CustomFees customFees = new CustomFees(customTariff,
                                        getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                        registrationFeeInBYN / dataIn.curEuro);
                                return new DataOut(dataIn, customFees);
                            } else if (dataIn.engineCapacity < secondDieselCapacityCategoryLimit) {
                                double case1Tariff = dataIn.firstCost * rateOrganizationLess3Years;
                                double case2Tariff = dataIn.engineCapacity * rateOrganizationLess3YearsMore1500Less2500LDiesel;
                                double customTariff = Math.max(case1Tariff, case2Tariff);
                                CustomFees customFees = new CustomFees(customTariff,
                                        getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                        registrationFeeInBYN / dataIn.curEuro);
                                return new DataOut(dataIn, customFees);
                            } else {
                                double case1Tariff = dataIn.firstCost * rateOrganizationLess3Years;
                                double case2Tariff = dataIn.engineCapacity * rateOrganizationLess3YearsMore2500LDiesel;
                                double customTariff = Math.max(case1Tariff, case2Tariff);
                                CustomFees customFees = new CustomFees(customTariff,
                                        getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                        registrationFeeInBYN / dataIn.curEuro);
                                return new DataOut(dataIn, customFees);
                            }
                        } else if (dataIn.carAge < secondAgeCategoryLimit) {
                            if (dataIn.engineCapacity <= firstDieselCapacityCategoryLimit) {
                                double case1Tariff = dataIn.firstCost * rateOrganizationMore3Less5Years;
                                double case2Tariff = dataIn.engineCapacity * rateOrganizationMore3Less5YearsLess1500LDiesel;
                                double customTariff = Math.max(case1Tariff, case2Tariff);
                                CustomFees customFees = new CustomFees(customTariff,
                                        getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                        registrationFeeInBYN / dataIn.curEuro);
                                return new DataOut(dataIn, customFees);
                            } else if (dataIn.engineCapacity < secondDieselCapacityCategoryLimit) {
                                double case1Tariff = dataIn.firstCost * rateOrganizationMore3Less5Years;
                                double case2Tariff = dataIn.engineCapacity * rateOrganizationMore3Less5YearsMore1500Less2500LDiesel;
                                double customTariff = Math.max(case1Tariff, case2Tariff);
                                CustomFees customFees = new CustomFees(customTariff,
                                        getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                        registrationFeeInBYN / dataIn.curEuro);
                                return new DataOut(dataIn, customFees);
                            } else {
                                double case1Tariff = dataIn.firstCost * rateOrganizationMore3Less5Years;
                                double case2Tariff = dataIn.engineCapacity * rateOrganizationMore3Less5YearsMore2500LDiesel;
                                double customTariff = Math.max(case1Tariff, case2Tariff);
                                CustomFees customFees = new CustomFees(customTariff,
                                        getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                        registrationFeeInBYN / dataIn.curEuro);
                                return new DataOut(dataIn, customFees);
                            }
                        } else {
                            if (dataIn.engineCapacity <= firstPetrolCapacityCategoryLimit) {
                                double customTariff = dataIn.engineCapacity * rateOrganizationMore5YearsLess1500LDiesel;
                                CustomFees customFees = new CustomFees(customTariff,
                                        getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                        registrationFeeInBYN / dataIn.curEuro);
                                return new DataOut(dataIn, customFees);
                            } else if (dataIn.engineCapacity < secondPetrolCapacityCategoryLimit) {
                                double customTariff = dataIn.engineCapacity * rateOrganizationMore5YearsMore1500Less2500LDiesel;
                                if (!dataIn.benefit) customTariff = customTariff / benefitRate;
                                CustomFees customFees = new CustomFees(customTariff,
                                        getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                        registrationFeeInBYN / dataIn.curEuro);
                                return new DataOut(dataIn, customFees);
                            } else {
                                double customTariff = dataIn.engineCapacity * rateOrganizationMore5YearsMore2500LDiesel;
                                if (!dataIn.benefit) customTariff = customTariff / benefitRate;
                                CustomFees customFees = new CustomFees(customTariff,
                                        getUtilFee(dataIn.personType, dataIn.carAge, dataIn.engineCapacity) / dataIn.curEuro,
                                        registrationFeeInBYN / dataIn.curEuro);
                                return new DataOut(dataIn, customFees);
                            }
                        }
                    }
                    default -> throw new IllegalStateException("Unexpected value: " + dataIn.fuelType);
                }
            }
            default -> throw new IllegalStateException("Unexpected value: " + dataIn.personType);
        }
    }
}


