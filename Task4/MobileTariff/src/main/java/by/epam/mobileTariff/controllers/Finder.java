package by.epam.mobileTariff.controllers;

import by.epam.mobileTariff.entity.tariffs.Tariff;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Finder {

    public static List<Tariff> findTariffByCost(List<Tariff> list, double low, double high) {

        List<Tariff> foundList = new ArrayList<>();

        for (Tariff tariff : list) {
            if (tariff.getCost().compareTo(BigDecimal.valueOf(low)) >= 0 &&
                    tariff.getCost().compareTo(BigDecimal.valueOf(high)) <= 0) {
                foundList.add(tariff);
            }
        }
        return foundList;
    }
}
