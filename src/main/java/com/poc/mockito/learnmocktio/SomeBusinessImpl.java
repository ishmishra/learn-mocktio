package com.poc.mockito.learnmocktio;

public class SomeBusinessImpl {

    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    public int findGreatestFromAllData() {
        int[] data = dataService.retrieveAllData();

        int greatestInt = Integer.MIN_VALUE;
        for (int value : data) {
            if (value > greatestInt) {
                greatestInt = value;
            }
        }
        return greatestInt;

    }
}
